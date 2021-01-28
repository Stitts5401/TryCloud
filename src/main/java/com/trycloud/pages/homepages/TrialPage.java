package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrialPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;
    @FindBy(xpath="//input[@id='et_pb_contact_name_2_0']")
    WebElement name;
    @FindBy(xpath = "//input[@id='et_pb_contact_company_0']")
    WebElement company;
    @FindBy(xpath = "//input[@id='et_pb_contact_email_0']")
    WebElement email;
    @FindBy(xpath = "//input[@id='et_pb_contact_password_0']")
    WebElement password;
    @FindBy(xpath = "//input[@id='et_pb_contact_telephone_0']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='et_pb_contact_info_0']")
    WebElement info;
    @FindBy(name="et_builder_submit_button")
    WebElement submit;
    public TrialPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }
    public void fillTrialForm(String name,String company, String email, String password,String phonenumber,String info){
        this.name.sendKeys(name);
        this.company.sendKeys(company);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.phoneNumber.sendKeys(password);
        this.info.sendKeys(info);
        submit.click();
    }
}
