package com.shop.spacex.pages.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpaceXShopBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @BeforeClass
    public void setup() {
        Reporter.log("=====Browser Session Started=====", true);
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://shop.spacex.com/");
    }

    @AfterClass
    public void close() {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
