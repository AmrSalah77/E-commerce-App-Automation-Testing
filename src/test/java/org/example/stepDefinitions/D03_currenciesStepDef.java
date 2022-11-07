package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user select Euro currency")
    public void userSelectEuroCurrency() {
        homePage.currencySelector().selectByIndex(1);
    }

    @Then("Euro Symbol is shown on the four products in the Home page")
    public void euroSymbolIsShownOnTheProductsInTheHomePage() {
        WebElement product;
        String price;
        for (int i = 0; i < 4; i++) {
            product = homePage.products().get(i);
            price = product.getText();
            Assert.assertTrue(price.contains("€"));
        }

    }
}
