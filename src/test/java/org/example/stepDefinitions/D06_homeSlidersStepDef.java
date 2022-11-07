package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user clicks on nokia slider")
    public void userClicksOnFirstSlider() {
        homePage.firstSlider().click();
    }

    @Then("user is redirected to nokia slider page")
    public void userIsRedirectedToFirstSliderPage() {
        String expectedUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(homePage.getCurrentUrl(),expectedUrl);
    }

    @When("user clicks on iphone slider")
    public void userClicksOnSecondSlider() {
        homePage.secondSlider().click();
    }

    @Then("user is redirected to iphone slider page")
    public void userIsRedirectedToSecondSliderPage() {
        String expectedUrl = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(homePage.getCurrentUrl(),expectedUrl);
    }
}
