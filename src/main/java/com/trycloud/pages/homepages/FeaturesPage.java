package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturesPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;

    @FindBy(xpath = "//div//a[@class='et_pb_button et_pb_button_0 et_hover_enabled et_pb_bg_layout_dark']")
    WebElement getStartedButton;


    public FeaturesPage(){
        PageFactory.initElements(driver,this);
    }


    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public boolean verifyLogo(){
        return
                logo.isEnabled();
    }
    public BuyPage gotoBuyPage(){
        getStartedButton.click();
        return new BuyPage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }
}
