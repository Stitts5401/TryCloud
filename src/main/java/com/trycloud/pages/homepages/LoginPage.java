package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import com.trycloud.pages.appPages.FilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//input[@name='user']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='submit']")
    WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public FilePage login(String un, String pass){
        usernameField.sendKeys(un);
        passwordField.sendKeys(pass);
        loginButton.click();
        return new FilePage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }

}
