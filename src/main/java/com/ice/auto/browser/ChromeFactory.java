package com.ice.auto.browser;

public class ChromeFactory implements BrowserFactory {

	public Browser getBrowserInstance() {
		return new Chrome();
	}

}
