package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

    @Test
    public void OpenBrowser()  {
        
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        
        System.setProperty("webdriver.chrome.driver", "/snap/bin/chromium.chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        
        driver = new FirefoxDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


