package com.automation.test;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUP() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");

        PropertyReaderUtils.intiProperty();
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

}
