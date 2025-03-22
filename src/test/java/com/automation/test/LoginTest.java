package com.automation.test;

import com.automation.utils.PropertyReaderUtils;
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
        userName.sendKeys(PropertyReaderUtils.getProperty("userName"));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(PropertyReaderUtils.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        //Actual Testing
        WebElement appLogo = driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
        Assert.assertTrue(appLogo.isDisplayed(), "You are not on the homepage");

    }


}
