package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage();
    Actions action = new Actions(Hooks.driver);
    String categoryName;


    @Given("user hover on categories")
    public void userHoverOnCategories() {
        action.moveToElement(homePage.mainCategories()).perform();
    }

    @When("user select a random sub-category")
    public void userSelectARandomSubCategory() {
        homePage.sub_categories().click();
        categoryName = homePage.sub_categories().getAttribute("href");
    }

    @Then("sub-category page is opened successfully")
    public void subcategoryPageIsOpenedSuccessfully() {
        String pageTitle = homePage.pageTitle().getText().toLowerCase().trim();
        Assert.assertTrue(categoryName.contains(pageTitle));
    }
}
