package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class=\"app_logo\"]")
    WebElement appLogo;

    @FindBy(xpath = "//div[@class=\"inventory_item_name \"]")
    List<WebElement> listOfTitleOnHomePage;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerBtn;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutBtn;


    String titleOnHomePage;

    public void verifyHomePage() {
        Assert.assertTrue(appLogo.isDisplayed(), "You are not on the homepage");
    }

    public void getProductTitle() {
        titleOnHomePage = listOfTitleOnHomePage.get(0).getText();
        System.out.println("titleOnHomePage = " + titleOnHomePage);

    }

    public void doLogOut() {
        burgerBtn.click();
        logOutBtn.click();
    }
}
