package com.herokuapp.the.internet.testsuite;

import com.herokuapp.the.internet.pages.LoginPage;
import com.herokuapp.the.internet.pages.PasswordErrorPage;
import com.herokuapp.the.internet.pages.UserNameErrorPage;
import com.herokuapp.the.internet.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
     LoginPage loginPage = new LoginPage();
     PasswordErrorPage passwordErrorPage = new PasswordErrorPage();
     UserNameErrorPage userNameErrorPage = new UserNameErrorPage();

     @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
         loginPage.enterUserName();
         loginPage.enterpassword();
         loginPage.clickonloginbutton();
         String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
         String actualMessage = getTextFromElement(By.xpath("//h4[@class='subheader']"));
         Assert.assertEquals("securearea text is not displayed", expectedMessage, actualMessage);
     }
@Test
    public void verifyTheUsernameErrorMessage(){
         userNameErrorPage.enterUserName();
         userNameErrorPage.enterpassword();
         userNameErrorPage.clickonloginbutton();
    String expected = "Your username is invalid!\n" + "×";

    String actualResult = getTextFromElement(By.xpath("//div[@id='flash']"));
    Assert.assertEquals("varify username", expected, actualResult);
}
@Test
    public void verifyThePasswordErrorMessage(){
         passwordErrorPage.enterUserName();
         passwordErrorPage.enterpassword();
         passwordErrorPage.clickonloginbutton();
    String expected =   "Your password is invalid!\n" + "×";
    String actualResult = getTextFromElement(By.xpath("//div[@id='flash']"));
    Assert.assertEquals("varify password", expected, actualResult);
     }
}

