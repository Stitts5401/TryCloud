package com.trycloud.pages.homepages;

import com.trycloud.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"logo\"]" )
    WebElement logo;
    @FindBy(name = "et_search_icon")
    WebElement search;
    @FindBy(xpath = "//input[@class='et-search-field']")
    WebElement searchBox;

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage goToHomePage(){
        logo.click();
        return new HomePage();
    }
    public String verifyTitle(){
        return driver.getTitle();
    }
    public String enterSearch(String str){
        search.click();
        searchBox.click();
        searchBox.sendKeys(str);
        return searchBox.getText();
    }

}
