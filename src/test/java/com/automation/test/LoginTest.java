package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginSuccessful() {

        //=======================1. verifyLoginSuccessful=========================//
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        //Actual Testing
        WebElement appLogo = driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
        Assert.assertTrue(appLogo.isDisplayed(), "You are not on the homepage");

        //=======================2. Add to Cart =========================//

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement cartBtn = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]"));
        cartBtn.click();

        WebElement cartPageLogo = driver.findElement(By.id("//span[@class=\"title\" and text()=\"Your Cart\"]"));
        Assert.assertTrue(cartPageLogo.isDisplayed(), "You are not on the cart page");

        WebElement cartItem = driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
        Assert.assertTrue(cartItem.isDisplayed(), "The item is not added to the cart");


        //===============================3. Verify Same item is appearing the Cart Page====================//



    }

}
