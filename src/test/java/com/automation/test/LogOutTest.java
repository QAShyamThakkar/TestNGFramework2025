package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LogOutTest {

    @Test
    public void verifyLogoutSuccessful() {

        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.doLogin();

        HomePage homePage = new HomePage();
        homePage.verifyHomePage();
        homePage.doLogOut();

    }


}
