package com.ice.auto.browser;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Enum for Browser Types
 */
public enum BrowserType {
    CHROME{
        @Override
        public WebDriver getBrowserType() {
            return new ChromeFactory().getBrowser().getWebDriver();
        }

        @Override
        public Capabilities getRemoteExecutionOptions() {
            return new ChromeOptions();
        }

    },
    FIREFOX{
        @Override
        public WebDriver getBrowserType() {
            return new FireFoxFactory().getBrowser().getWebDriver();
        }

        @Override
        public Capabilities getRemoteExecutionOptions() {
            return new FirefoxOptions();
        }
    },
    EDGE{
        @Override
        public WebDriver getBrowserType() {
            return new EdgeFactory().getBrowser().getWebDriver();
        }

        @Override
        public Capabilities getRemoteExecutionOptions(){
            return new EdgeOptions();
        }
    };

    public abstract WebDriver getBrowserType();
    public abstract Capabilities getRemoteExecutionOptions();
}
