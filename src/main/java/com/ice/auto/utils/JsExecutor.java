package com.ice.auto.utils;

import com.ice.auto.browser.BrowserService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutor {

	public static void scrollIntoView(WebElement webElement) {
		((JavascriptExecutor) BrowserService.getInstance().getBrowser())
				.executeScript("arguments[0].scrollIntoView(true);", webElement);
		WaitFor.duration.accept(2000);
	}
}
