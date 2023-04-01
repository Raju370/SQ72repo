package com.shop.spacex.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.shop.spacex.pages.base.SpaceXShopBase;

public class SpaceXShopSearch extends SpaceXShopBase {

    public static By searchBtn=By.xpath("//button[text()='Search']");
    public static By searchTxt=By.id("search-input");
    public static By viewAllLnk=By.xpath("//a[text()='View all']");
    public static By productTitles=By.xpath("//span[@class='ProductItem__Title Heading']/a[contains(@href,'sid')]");
    public static By productPrice=By.xpath("//span[@class='money pre-money']");
    public static By results=By.xpath("//div[contains(text(),'results for')]");
	public static By productLnk=By.xpath("//a[.=concat('Men',\"'\",'s SpaceX Polo')]");
    
    public void searchItemsAndPrint(String searchText) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
        driver.findElement(searchBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchTxt));
        driver.findElement(searchTxt).sendKeys(searchText);
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewAllLnk));
        driver.findElement(viewAllLnk).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(results));
        
        List<WebElement> productTitlesEle=driver.findElements(productTitles);
        List<WebElement> productPriceEle=driver.findElements(productPrice);
        
        for(int i=0;i<productPriceEle.size();i++){
            System.out.println(productTitlesEle.get(i).getText()+" "+productPriceEle.get(i).getText());
        }
    }
    
	public void clickOnItem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(productLnk));
		driver.findElement(productLnk).click();
	}
}
