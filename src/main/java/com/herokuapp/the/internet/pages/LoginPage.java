package com.herokuapp.the.internet.pages;

import com.herokuapp.the.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = (By.xpath("//input[@id='username']"));
    By password = (By.xpath("//input[@id='password']"));
    By loginbutton = (By.xpath("//i[contains(text(),'Login')]"));

    public void enterUserName(){
        sendTextToElement(username,"tomsmith");

    }
    public void enterpassword(){
        sendTextToElement(password,"SuperSecretPassword!");
    }
    public void clickonloginbutton(){
        clickOnElement(loginbutton);
    }
}
