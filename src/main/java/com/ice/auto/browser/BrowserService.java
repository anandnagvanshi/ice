package com.ice.auto.browser;

import org.openqa.selenium.WebDriver;

/**
 * Singleton class to hold Browser instance
 */
public class BrowserService {
    private static BrowserService instance= null;
    private static ThreadLocal<WebDriver> webDriverThreadLocal =new ThreadLocal<>();


    private BrowserService(){
//        setThreadLoacalWebDriver();

    }

    public void setBrowserType(String browserType) {
        webDriverThreadLocal.set(BrowserController.selectBrowser(browserType));
    }

    /**
     * To get the instance of BrowserService
     * @return BrowserService
     */
    public static BrowserService getInstance() {
        if (instance == null) {
            instance = new BrowserService();
        }
        return instance;
    }

    /**
     * To get the Browser Instance
     * @return Webdriver
     */
    public WebDriver getBrowser(){
        return webDriverThreadLocal.get();
    }
}

