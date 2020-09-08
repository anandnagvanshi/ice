package com.ice.auto.utils;

import com.ice.auto.browser.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Element {

	public static WebElement getWebElement(String type,String locator) {
		switch (type.toUpperCase()) {
		case "XPATH":
			return BrowserService.getInstance().getBrowser().findElement(By.xpath(locator));
		}
		return null;
	}

	public static void clearAndSendKeys(WebElement webElement, String value) {
		webElement.clear();
		webElement.sendKeys(value);
	}

	public static void sendKeys(WebElement webElement, String value) {
		webElement.sendKeys(value);
	}

	public static void select(WebElement webElement) {
		webElement.click();
	}
	
	public static void selectOption(List<WebElement> webElements, String value) {
		webElements.forEach( webElement ->{
			if(webElement.getText().equalsIgnoreCase(value)) {
				webElement.click();
			}
		});
	}
	
	public static void selectOptionByIndex(List<WebElement> webElements, int index) {
		webElements.get(index-1).click();
	}
}
