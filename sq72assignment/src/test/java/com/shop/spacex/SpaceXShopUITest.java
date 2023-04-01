package com.shop.spacex;

import org.testng.annotations.Test;

import com.shop.spacex.pages.SpaceXShopCart;
import com.shop.spacex.pages.SpaceXShopProduct;
import com.shop.spacex.pages.SpaceXShopSearch;
import com.shop.spacex.pages.base.SpaceXShopBase;

public class SpaceXShopUITest extends SpaceXShopBase{

	SpaceXShopSearch spaceXShopSearch=new SpaceXShopSearch();
	SpaceXShopProduct spaceXShopProduct=new SpaceXShopProduct();
	SpaceXShopCart spaceXShopCart=new SpaceXShopCart();

	@Test(description = "Shop SpaceX - Search, Add to Cart")
	public void testSearchSpaceXShop() throws Exception {

		//Search Page
		spaceXShopSearch.searchItemsAndPrint("Space");
		spaceXShopSearch.clickOnItem();

		// Product Page
		String expectedProductDesc = "Embroidered SpaceX logo";
		double productPrice = spaceXShopProduct.getProductPrice();
		spaceXShopProduct.verifyProductDetails(productPrice, expectedProductDesc);
		int expectedQuantity = 2;
		spaceXShopProduct.addQuantity(expectedQuantity);

		//Cart Page
		spaceXShopCart.verifyPrice(2, productPrice);
	}
}
