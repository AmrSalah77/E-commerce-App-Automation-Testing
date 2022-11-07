package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    String skuWord;

    @When("user search by product name {string}")
    public void userSearchByProductName(String productName) {
        homePage.searchBox().sendKeys(productName);
        homePage.searchButton().click();
    }

    @Then("user gets redirected to search page")
    public void userGetsRedirectedToSearchPage() {
        Assert.assertTrue(homePage.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("Search page contains relevant results")
    public void searchPageContainsRelevantResults() {
        WebElement results;
        int size = homePage.products().size();
        String resultText;
        String searchedWord;
        for (int i = 0; i < size; i++) {
            results =homePage.productName().get(i);
            resultText = results.getText();
            searchedWord = homePage.searchedWord().getAttribute("value");
            Assert.assertTrue(resultText.toLowerCase().contains(searchedWord));
        }
    }

    @When("user search by sku {string}")
    public void userSearchBySku(String sku) {
        homePage.searchBox().sendKeys(sku);
        homePage.searchButton().click();
        skuWord = homePage.searchedWord().getAttribute("value");
    }

    @And("user selects the product")
    public void userSelectsTheProduct() {
        homePage.productTitleSku().click();
    }

    @Then("product page contains the same sku")
    public void productPageContainsTheSameSku() {
        String skuText = homePage.productSku().getText();
        Assert.assertTrue(skuText.contains(skuWord));
    }
}
