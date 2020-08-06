package com.bitrix24.step_definitions;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.pages.MainPage;
import com.bitrix24.utulities.ConfigurationReader;
import com.bitrix24.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_stepDefinitions {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    MainPage mainPage = new MainPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User enters correct username {string}")
    public void user_enters_correct_username(String username) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(loginPage.email));
        loginPage.email.sendKeys(username);

    }

    @When("User enters correct password {string}")
    public void user_enters_correct_password(String password) {
        loginPage.password.sendKeys(password);

    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();


    }

    @Then("User name should be {string}")
    public void user_name_should_be(String exceptedUserName) {
        wait.until(ExpectedConditions.visibilityOf(mainPage.username));
        String actualUsername = mainPage.username.getText();

        Assert.assertTrue(actualUsername.equals(exceptedUserName));

        Driver.closeDriver();


    }


    @And("User enters incorrect password {string}")
    public void userEntersIncorrectPassword(String incorrectPassword) {
        loginPage.password.sendKeys(incorrectPassword);

    }

    @Then("User should see warning message: {string}")
    public void userShouldSeeWarningMessage(String expectedWarningMessage) {

        String actualWarningMessage=loginPage.warningMessage.getText();

        Assert.assertEquals("wrong text",actualWarningMessage,expectedWarningMessage);

    }
}
