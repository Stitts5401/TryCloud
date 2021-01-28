package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;

    public PricingPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public String verifyTitle(){
       return driver.getTitle();
    }
}
