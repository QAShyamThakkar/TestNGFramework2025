package com.automation.test;

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
    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.quitDriver();
    }

}
