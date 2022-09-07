package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

    @Test
    public void OpenBrowser()  {
        
        // WebDriverManager.chromedriver().setup();
        
        System.setProperty("webdriver.chrome.driver", "/snap/bin/chromium.chromedriver");
        
        ChromeDriverService service= ChromeDriverService.CreateDefaultService("/snap/bin/chromium.chromedriver");
        service.Port = "9515";
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        WebDriver driver = new ChromeDriver(service, options);
        
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}

