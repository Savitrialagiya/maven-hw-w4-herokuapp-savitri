package com.herokuapp.internet.the.pages;

import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordFiled = By.id("password");
    By loginButton = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");
    By welcomeText = By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]");
    By usernameInvalidText = By.xpath("//div[@class=\"flash error\"]");
    By passwordInvalidText = By.xpath("//div[@class=\"flash error\"]");

    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordFiled,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
       return getTextFromElement(welcomeText);
    }
    public String getUserNameInvalidText(){
        return getTextFromElement(usernameInvalidText);
    }
    public String getPasswordInvalidText(){
        return getTextFromElement(passwordInvalidText);
    }

}
