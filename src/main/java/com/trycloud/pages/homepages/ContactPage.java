package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;
    @FindBy(name = "et_pb_contact_name_0")
    WebElement name;
    @FindBy(xpath = "//p//input[@id='et_pb_contact_email_0']")
    WebElement email;
    @FindBy(xpath = "//p//input[@id='et_pb_contact_subject_0']")
    WebElement subject;
    @FindBy(xpath = "//p//input[@id='et_pb_contact_message_0']")
    WebElement message;
    @FindBy(name="et_builder_submit_button")
    WebElement submit;

    public ContactPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }
    public String enterName(String str){
        name.click();
        name.sendKeys(str);
        return name.getText();
    }
    public String enterEmail(String str){
        email.click();
        email.sendKeys(str);
        return email.getText();
    }
    public String Subject(String str){
        subject.click();
        subject.sendKeys(str);
        return subject.getText();
    }
    public String message(String str){
        message.click();
        message.sendKeys(str);
        return message.getText();
    }
    public void clickSubmit(){
        submit.click();
    }
}
