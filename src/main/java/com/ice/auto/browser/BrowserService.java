package com.ice.auto.browser;

import org.openqa.selenium.WebDriver;

public class BrowserService {

	private static BrowserService instance=null;
	private static WebDriver webDriver;
	
	private BrowserService() {
		webDriver=BrowserController.selectBrowser(System.getProperty("browser").toUpperCase());
	}
	
	public static BrowserService getInstance() {
		
		if(instance == null){
            instance = new BrowserService();
        }
        return instance;
		
	}
	
	public WebDriver getBrowser() {
		
		return webDriver;
	}
}

