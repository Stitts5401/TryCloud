package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;
    @FindBy(xpath= "//div//a[@class='et_pb_button et_pb_custom_button_icon et_pb_button_0 et_pb_bg_layout_light']")
    WebElement requestBasicOffer;
    @FindBy(xpath= "//div//a[@class='et_pb_button et_pb_custom_button_icon et_pb_button_1 et_pb_bg_layout_light']")
    WebElement requestStandardOffer;
    @FindBy(xpath= "//div//a[@class='et_pb_button et_pb_custom_button_icon et_pb_button_2 et_pb_bg_layout_light']")
    WebElement requestPremiumOffer;
public BuyPage(){
    PageFactory.initElements(driver,this);
}

    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }
    public void canRequestBasicOffer(){
        requestBasicOffer.click();
    }
    public void canRequestStandardOffer(){
        requestStandardOffer.click();
    }
    public void canRequestPremiumOffer(){
        requestPremiumOffer.click();
    }



}
