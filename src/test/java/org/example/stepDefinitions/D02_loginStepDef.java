package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_loginPage;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_loginPage loginPage = new P02_loginPage();

    @Given("user go to login page")
    public void goLoginPage()
    {
        loginPage.loginLink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String email, String password) {
        loginPage.Email().sendKeys(email);
        loginPage.Password().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginPage.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        String current_Url= "https://demo.nopcommerce.com/";
        softAssert.assertEquals(loginPage.getCurrentUrl(), current_Url);
        softAssert.assertTrue(loginPage.myAccount().isDisplayed());
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert softAssert = new SoftAssert();
        String expectedColor = "#e4434b";
        softAssert.assertTrue(loginPage.failedLoginMsg().getText().contains("Login was unsuccessful."));
        softAssert.assertEquals(loginPage.getMsgColor(),expectedColor);
        softAssert.assertAll();
    }

}
