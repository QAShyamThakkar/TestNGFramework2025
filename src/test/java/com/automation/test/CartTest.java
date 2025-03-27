package com.automation.test;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CartTest extends BaseTest {

    @Test
    public void verifyUserCanAddProductToCart() {

        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.doLogin();

        HomePage homePage = new HomePage();
        homePage.verifyHomePage();
        homePage.getProductTitle();

        CartPage cartPage = new CartPage();
        cartPage.addToCart();
        cartPage.verifyUserIsOnCartPage();
//        cartPage.verifyProductDetailsPage();

    }
}