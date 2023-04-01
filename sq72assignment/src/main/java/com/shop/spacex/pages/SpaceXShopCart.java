package com.shop.spacex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.shop.spacex.pages.base.SpaceXShopBase;

public class SpaceXShopCart extends SpaceXShopBase {

    public static By totalPrice=By.xpath("//p[text()='Total: ']/..//span");
    
    public void verifyPrice(int q, double price) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalPrice));
        String total = driver.findElement(totalPrice).getText();
        
        Assert.assertEquals(total,"$"+(q*price)+"0");
    }
}
