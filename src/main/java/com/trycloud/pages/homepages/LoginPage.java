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
    @FindBy(xpath = "//div//p[@class='warning wrongPasswordMsg']")
    WebElement errorMsg;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public FilePage loginHappyPath(){
            usernameField.sendKeys(prop.getProperty("username"));
            passwordField.sendKeys(prop.getProperty("password"));
                loginButton.click();
        return new FilePage();
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

    public void loginWithUsernamePassword(String arg0, String arg1) {
        usernameField.sendKeys(arg0);
        passwordField.sendKeys(arg1);
        loginButton.click();
    }

    public String checkUrl() {
        return driver.getCurrentUrl();
    }

    public String checkTitle() {
        return driver.getTitle();
    }

    public boolean containsErrorMsg() {
        return errorMsg.isDisplayed();
    }
}
