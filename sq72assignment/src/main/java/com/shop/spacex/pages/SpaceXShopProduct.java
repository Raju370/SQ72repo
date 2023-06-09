package com.shop.spacex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.shop.spacex.pages.base.SpaceXShopBase;

public class SpaceXShopProduct extends SpaceXShopBase {

    public static By itemPrice=By.xpath("//span[@class='money cash-money pre-money']");
    public static By itemDescription=By.xpath("//div[@class='ProductMeta__Description']/div/p[1]");
    public static By addToCart=By.xpath("//span[text()='Add to cart']");
    public static By quantity=By.name("quantity");
    public static By cartQuantity=By.xpath("//span[@data-action='increase-quantity']");

    public void verifyProductDetails(double price,String details) {
        
        Assert.assertEquals(getProductPrice(),price);
        Assert.assertEquals(driver.findElement(itemDescription).getText(),details);
    }
    
    public Double getProductPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrice));
        return Double.valueOf(driver.findElement(itemPrice).getText().replace("$", ""));
    }
    
    public String getProductDescription() {
        return driver.findElement(itemDescription).getText();
    }
    
    public void addQuantity(int q) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(quantity));
        quantity(q);
        driver.findElement(addToCart).click();
    }
    
    public void quantity(int i) {
        for (int j=1;j<i;j++) {
            wait.until(ExpectedConditions.elementToBeClickable(cartQuantity));
            driver.findElement(cartQuantity).click();
        }
    }
    
}
