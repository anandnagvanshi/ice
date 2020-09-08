package com.ice.auto.browser;

import com.ice.auto.exception.UnsupportedBrowserException;
import org.openqa.selenium.WebDriver;

public class BrowserController {

	public static WebDriver selectBrowser(String type) {
		WebDriver webDriver;
		try{ 
		webDriver=BrowserType.valueOf(type).getBrowserType();
		}catch (IllegalArgumentException e) {
			throw new UnsupportedBrowserException("BROWSER TYPE NOT SUPPORTED ["+type+"]");
		}
		return webDriver;
	}
}
