package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_registerPage;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_registerPage registerPage = new P01_registerPage();

    @Given("user go to register page")
    public void goRegisterPage()
    {
        registerPage.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        registerPage.pickMaleGender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        registerPage.firstName().sendKeys(firstName);
        registerPage.lastName().sendKeys(lastName);
    }

    @And("user enter date of birth {string}")
    public void userEnterDateOfBirth(String date) {
        String[] dates = date.split("/");
        registerPage.DateOfBirthDay().selectByValue(dates[0]);
        registerPage.DateOfBirthMonth().selectByValue(dates[1]);
        registerPage.DateOfBirthYear().selectByValue(dates[2]);
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        registerPage.email().sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirmation) {
        registerPage.password().sendKeys(password);
        registerPage.confirmPassword().sendKeys(confirmation);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registerPage.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        String expectedMessage = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";
        softAssert.assertEquals(registerPage.registerMessage().getText(), expectedMessage);
        softAssert.assertEquals(registerPage.getMsgColor(), expectedColor);
        softAssert.assertAll();
    }


}
