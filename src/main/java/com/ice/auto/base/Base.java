package com.ice.auto.base;

import com.ice.auto.browser.BrowserService;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {

    public static <T extends Base> T init(Class<T> page){
        return PageFactory.initElements(BrowserService.getInstance().getBrowser(),page);
    }
}
