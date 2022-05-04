package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomeLogInPage extends Utility {
By userName = By.xpath("//input[@id='txtUsername']");
By passWord = By.xpath("//input[@id='txtPassword']");
By logIn = By.xpath("//input[@id='btnLogin']");
By verifyText = By.xpath("//a[@id='welcome']");

public void enterUserName(String user){
    sendTextToElement(userName,user);
}
public void enterPassWord(String pass) {
    sendTextToElement(passWord, pass);
}
public void clickOnLoginButton(){
    clickOnElement(logIn);
}
public String verifyWelcomeTextDisplay(){
    return getTextFromElement(verifyText);
}




}
