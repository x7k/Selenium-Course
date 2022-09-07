package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

    @Test
    public void OpenBrowser()  {
        
        //WebDriverManager.chromiumdriver().setup();
        
        System.setProperty("webdriver.chromium.driver", "/snap/bin/chromium.chromedriver");
                
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        //options.setExperimentalOption("debuggerAddress", "127.0.0.1:9515");
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}

