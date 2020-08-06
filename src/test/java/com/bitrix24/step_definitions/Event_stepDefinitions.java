package com.bitrix24.step_definitions;

import com.bitrix24.pages.EventPage;
import com.bitrix24.pages.MainPage;
import com.bitrix24.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Event_stepDefinitions {
    MainPage mainPage = new MainPage();
    EventPage eventPage = new EventPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());

    @When("User clicks the tab{string}")
    public void userClicksTheTab(String tab) {
        wait.until(ExpectedConditions.visibilityOf(mainPage.event));
        switch (tab.toLowerCase()) {
            case "message":
                mainPage.message.click();
                break;
            case "task":
                mainPage.task.click();
                break;
            case "event":
                mainPage.event.click();
                break;
            case "poll":
                mainPage.poll.click();
                break;
            case "more":
                mainPage.more.click();
                break;
            default:
        }
    }

    @When("User clicks the icon {string}")
    public void user_clicks_the_icon(String icon) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(eventPage.uploadFiles));
        // actions.moveToElement(eventPage.link).perform();
        Thread.sleep(3000);
        switch (icon.toLowerCase()) {
            case "upload files":
                eventPage.uploadFiles.click();
                break;
            case "link":
                eventPage.link.click();
                break;
            case "insert Video":
                eventPage.insertVideo.click();
                break;
            case "quote text":
                eventPage.quoteText.click();
                break;

        }

    }

    @When("User clicks the option {string}")
    public void user_clicks_the_option(String options) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(eventPage.table));
        Thread.sleep(3000);
        switch (options.toLowerCase()) {
            case "upload files and images":
                eventPage.UploadFilesAndImages.click();
                break;
            case "select document from bitrix24":
                eventPage.selectDocumentFromBitrix24.click();
                break;
            case "create using desktop applications":
                eventPage.createUsingDesktopApplications.click();
                break;
            case "download from external drive":
                eventPage.downloadFromExternalDrive.click();
                break;
        }
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @When("User {string} files or image from PC")
    public void user_files_or_image_from_pc(String upload) throws InterruptedException {
//Thread.sleep(5000);
//        WebElement choosePic=eventPage.UploadFilesAndImages;
//        Thread.sleep(5000);
//        choosePic.sendKeys(upload);

    }

    @When("User clicks the button {string}")
    public void user_clicks_the_button(String button) {
      //  eventPage.saveButton.click();


    }




    @And("User enters  the link text  {string} and {string}")
    public void userEntersTheLinkTextAnd(String linkText, String url) throws InterruptedException {
        Thread.sleep(3000);
        eventPage.linkText.sendKeys("Google");
        Thread.sleep(3000);
        eventPage.linkURL.sendKeys("https://www.google.com/" + Keys.ENTER);


    }

    @Then("User should be able to see {string}")
    public void user_should_be_able_to_see(String verification) throws InterruptedException {

        String expectedTest="Google";
        String actualLinkText = eventPage.linkText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualLinkText,expectedTest);


    }



}
