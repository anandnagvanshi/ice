package com.ice.auto.browser;

import org.openqa.selenium.WebDriver;

public enum BrowserType {

	CHROME("CHROME"){

		@Override
		public WebDriver getBrowserType() {
			BrowserFactory chromeFactory = new ChromeFactory();
			Browser chrome=chromeFactory.getBrowserInstance();
			return chrome.getBrowser();
		}
		
	};
	
	private String type;
	private BrowserType(String type) {
		this.type=type;
	}
	
	public abstract WebDriver getBrowserType();

	public String getType() {
		return type;
	}
}
