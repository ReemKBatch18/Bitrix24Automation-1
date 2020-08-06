package com.bitrix24.pages;

import com.bitrix24.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement username;


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement message;
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement task;
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement event;
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement more;




}