package com.trycloud.pages.appPages;

import com.trycloud.base.TestBase;
import com.trycloud.testutl.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class FilePage extends TestBase {

    //HEADER TABS//

    @FindBy(xpath = "//div//a[@id='nextcloud']")
    WebElement homebutton;
    @FindBy(xpath = "//li[@data-id='activity']")
    WebElement activity;
    @FindBy(xpath = "//li[@data-id='gallery']")
    WebElement gallery;
    @FindBy(xpath = "//li[@data-id='spreed']")
    WebElement talk;
    @FindBy(xpath = "//li[@data-id='calendar']")
    WebElement calendar;
    @FindBy(xpath = "//li[@data-id='deck']")
    WebElement deck;
    @FindBy(xpath = "//li[@data-id='announcementcenter']")
    WebElement announcements;
    //HEADER TABS//

    //SideTabs//
    @FindBy(className = "nav-files\t\t\t\t\t\t")
    WebElement allFilesTab;
    @FindBy(className = "nav-recent\t\t\t\t\t\t")
    WebElement recentTab;
    @FindBy(className = "nav-favorites\t\t\t\t\t\t")
    WebElement favoriteTab;
    @FindBy(className = "nav-shareoverview\t\tcollapsible\t\t\t\t")
    WebElement shareTab;
    @FindBy(className = "nav-systemtagsfilter\t\t\t\t\t\t")
    WebElement tagsTab;
    @FindBy(className = "nav-trashbin  pinned  first-pinned   ui-droppable")
    WebElement trashCan;
    @FindBy(className = "pinned has-tooltip")
    WebElement settingsTab;
    //SideTabs//


    //innerFunctions//
    @FindBy(className = "crumb svg crumbhome")
    WebElement houseButton;
    @FindBy(className = "button new")
    WebElement plusButton;
    @FindBy(xpath = "//li//label[contains(@class, 'menuitem') and contains(@data-action, 'upload')]")
    WebElement plus_UploadFile;
    @FindBy(xpath = "//li//a[contains(@class, 'menuitem') and contains(@data-action, 'folder')]")
    WebElement plus_NewFolder;
    @FindBy(xpath = "//li//a[contains(@class, 'menuitem') and contains(@data-action, 'file')]")
    WebElement plus_TextFile;
    @FindBy(xpath = "//div[@class='ace_content'][1]")
    WebElement aceContent;
    @FindBy(xpath = "//div//button[@id='editor_close']")
    WebElement editorClose;
    //innerFunctions//

    public FilePage() {
        PageFactory
                .initElements(driver, this);
    }

    public FilePage goToFilePage() {
        homebutton.click();
        return new FilePage();
    }

    //CHECK//
    public boolean hasModule(String arg0) {
        switch (arg0) {
            case "Files":
                if (homebutton.isDisplayed()) {
                    return true;
                } else
                    break;
            case "Galleries":
                if (gallery.isDisplayed()) {
                    return true;
                } else
                    break;
            case "Activity":
                if (activity.isDisplayed()) {
                    return true;
                } else
                    break;
            case "Talk":
                if (talk.isDisplayed()) {
                    return true;
                } else
                    break;
            case "Deck":
                if (deck.isDisplayed()) {
                    return true;
                } else
                    break;
            case "Calendar":
                if (calendar.isDisplayed()) {
                    return true;
                }
                break;

            case "Announcements":
                if (announcements.isDisplayed()) {
                    return true;
                } else
                    break;
            default:

        }
        return false;
    }

    public boolean checkUrl() {
        return driver.getTitle().equals("Files - Trycloud");
    }
    //CHECK//

    //MOVEMENT//
    public ActivityPage goToActivityPage() {
        activity.click();
        return new ActivityPage();
    }

    public GalleryPage goToGalleryPage() {
        gallery.click();
        return new GalleryPage();
    }

    public TalkPage goToTalkPage() {
        talk.click();
        return new TalkPage();
    }

    public CalenderPage goToCalenderPage() {
        calendar.click();
        return new CalenderPage();
    }

    public DeckPage goToDeckPage() {
        deck.click();
        return new DeckPage();
    }

    public AnnouncementsPage goToAnnouncementsPage() {
        announcements.click();
        return new AnnouncementsPage();
    }
    //MOVEMENT//

    //ACTION//
    public void createFolder(String folderName) {
        plusButton.click();
        plus_NewFolder.click();
        plus_NewFolder.sendKeys(folderName);
    }

    public void createTextFile(String fileName) {
        goToFilePage().plusButton.click();
        plus_TextFile.click();
        plus_TextFile.sendKeys(fileName + Keys.ENTER);
        aceContent.sendKeys("NEW TEXT");
        editorClose.click();
    }

    public void renameFile(String fileName) {
        driver.findElement(By.xpath("//tr[@data-file='" + fileName + "']//td//label ")).click();
        trashCan.click();
    }

    public String canClick(String arg0) {

        switch (arg0) {
            case "Files":
                if (homebutton.isDisplayed()) {
                    homebutton.click();
                    TestUtil.sleep(500);
                    return driver.getTitle()+"ERRORCHECK";
                } else
                    break;
            case "Galleries":
                if (gallery.isDisplayed()) {
                    gallery.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                } else
                    break;
            case "Activity":
                if (activity.isDisplayed()) {
                    activity.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                } else
                    break;
            case "Talk":
                if (talk.isDisplayed()) {
                    talk.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                } else
                    break;
            case "Deck":
                if (deck.isDisplayed()) {
                    deck.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                } else
                    break;
            case "Calendar":
                if (calendar.isDisplayed()) {
                    calendar.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                }
                break;

            case "Announcements":
                if (announcements.isDisplayed()) {
                    announcements.click();
                    TestUtil.sleep(500);
                    return driver.getTitle();
                } else
                    break;
            default:

        }

        return "NULL";
    }
    //ACTION//

}




