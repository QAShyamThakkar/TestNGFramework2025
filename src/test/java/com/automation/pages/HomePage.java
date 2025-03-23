package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class=\"app_logo\"]")
    WebElement appLogo;


    public void verifyHomePage() {
        Assert.assertTrue(appLogo.isDisplayed(), "You are not on the homepage");
    }



}
