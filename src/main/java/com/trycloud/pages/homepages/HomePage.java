package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//*[@id=\"et-top-navigation\"]//nav//ul//li[1]")
    WebElement featuresTab;
    @FindBy(xpath = "//*[@id=\"et-top-navigation\"]//nav//ul//li[2]")
    WebElement pricingTab;
    @FindBy(xpath = "//*[@id=\"et-top-navigation\"]//nav//ul//li[3]")
    WebElement contactTab;
    @FindBy(xpath = "//*[@id=\"et-top-navigation\"]//nav//ul//li[4]")
    WebElement trialTab;
    @FindBy(xpath = "//*[@id=\"et_top_search\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"et-top-navigation\"]//nav//ul//li[5]")
    WebElement loginTab;
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public FeaturesPage goToFeatures(){
            featuresTab.click();
        return new FeaturesPage();
    }
    public PricingPage goToPricing(){
            pricingTab.click();
        return new PricingPage();
    }
    public ContactPage goToContacts(){
            contactTab.click();
        return new ContactPage();
    }
    public TrialPage goToTrial(){
            trialTab.click();
        return new TrialPage();
    }
    public SearchPage goToSearch(){
            search.click();
        return new SearchPage();
        }
    public String verifyTitle(){
        return driver.getTitle();
    }
    public LoginPage goToLogin(){
            loginTab.click();
        return new LoginPage();
    }
}
