package com.ice.auto.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class AdditionalCondition {

	public static ExpectedCondition<Boolean> jQueryCompleted(){
		return new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver webDriver) {
				return (Boolean)((JavascriptExecutor )webDriver ).executeScript("return (window.jQuery !=null) && (jQuery.active===0);");
			}
		};
	}
}
