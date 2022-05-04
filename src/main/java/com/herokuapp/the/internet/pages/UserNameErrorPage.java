package com.herokuapp.the.internet.pages;

import com.herokuapp.the.internet.utility.Utility;
import org.openqa.selenium.By;

public class UserNameErrorPage extends Utility {
    By username = (By.xpath("//input[@id='username']"));
    By password = (By.xpath("//input[@id='password']"));
    By loginbutton = (By.xpath("//i[contains(text(),'Login')]"));

    public void enterUserName(){
        sendTextToElement(username,"tomsmith1");

    }
    public void enterpassword(){
        sendTextToElement(password,"SuperSecretPassword!");
    }
    public void clickonloginbutton(){
        clickOnElement(loginbutton);
    }
}

