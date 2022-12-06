package com.herokuapp.internet.the.testsuite;

import com.herokuapp.internet.the.pages.LoginPage;
import com.herokuapp.internet.the.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(loginPage.getWelcomeText(),expectedMessage,"welcome text not displayed");

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!\n" + "×";
        Assert.assertEquals(loginPage.getUserNameInvalidText(),expectedMessage,"Username Invalid text not displayed");

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!\n" + "×";
        Assert.assertEquals(loginPage.getPasswordInvalidText(),expectedMessage,"Password Invalid text not displayed");
    }
}
