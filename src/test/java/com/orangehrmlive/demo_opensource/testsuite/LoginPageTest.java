package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotPassword;
import com.orangehrmlive.demo_opensource.pages.HomeLogInPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomeLogInPage homePage = new HomeLogInPage();
    ForgotPassword forgotpass = new ForgotPassword();

    @Test
    public void verifyUserShouldLogInWithValidCredentials() {
        homePage.enterUserName("Admin");
        homePage.enterPassWord("admin123");
        homePage.clickOnLoginButton();
        String expectedMessage = "Welcome Dileep";
        String actualMessage = homePage.verifyWelcomeTextDisplay();
        Assert.assertEquals(expectedMessage,actualMessage,"Welcome Dileep");
    }
    @Test
    public void verifyUserShouldNavigateToForgotPassword(){
        forgotpass.clickOnForgotPassword();
        String expectedMessage =  "Forgot Your Password?";
        String actualMessage = forgotpass.verifyForgotPassword();
        Assert.assertEquals(expectedMessage,actualMessage,"Text is correct");
    }

}