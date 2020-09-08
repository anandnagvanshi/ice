package com.ice.auto.utils;

import com.ice.auto.browser.BrowserService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.*;

public class WaitFor {
	private static final int TILL = 180;

	public static Function<WebElement,WebElement> elementToBeVisible = webElement -> {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	};


	public static Consumer<WebElement> elementTobeVisibleStale= webElement ->  {
		final WebDriverWait wait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(webElement)));
	};

	public static Function<WebElement,WebElement> elementTobeClickable= webElement -> {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		return webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
	};

	public static TriConsumer<WebElement, String, String> attributeToBe=(webElement,attribute,value) -> {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		webDriverWait.until(ExpectedConditions.attributeToBe(webElement, attribute, value));
	};

	public static BiConsumer<WebElement, String> elementTextToBe=( webElement, value) -> {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		webDriverWait.until(ExpectedConditions.textToBePresentInElement(webElement, value));
	};

	public static Void pageLoad= ()-> {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserService.getInstance().getBrowser(), TILL);
		webDriverWait.until(AdditionalCondition.jQueryCompleted());
	};

	public static Consumer<Integer> duration=  time -> {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};

}
