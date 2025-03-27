package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(xpath = "//span[@class=\"shopping_cart_badge\"]")
    WebElement cartBtn;

    @FindBy(xpath = "//span[@class=\"title\" and text()=\"Your Cart\"]")
    WebElement cartPageLogo;

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    WebElement cartItem;

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    List<WebElement> listOfTitleOnCartPage;


    public void addToCart() {
        addToCart.click();
        cartBtn.click();
    }

    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPageLogo.isDisplayed(), "You are not on the cart page");
        Assert.assertTrue(cartItem.isDisplayed(), "The item is not added to the cart");

    }

    public void verifyProductDetailsPage() {
        HomePage homePage = new HomePage();


        String titleOnCartPage = listOfTitleOnCartPage.get(0).getText();
        System.out.println(homePage.titleOnHomePage);
        System.out.println("titleOnCartPage = " + titleOnCartPage);

        Assert.assertEquals(titleOnCartPage, homePage.titleOnHomePage , "The item is not same");


    }


}




