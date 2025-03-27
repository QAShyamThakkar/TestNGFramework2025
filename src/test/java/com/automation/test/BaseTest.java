package com.automation.test;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

   static WebDriver driver;

    @BeforeMethod
    public void setUP() {
        DriverUtils.initDriver();
        driver = DriverUtils.getDriver();

        PropertyReaderUtils.intiProperty();

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        CartPage cartPage = new CartPage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.quitDriver();
    }

}
