package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    @When("user clicks on wishList button")
    public void clickWishListBtn()
    {
        homePage.wishListButton().click();
    }

    @Then("wishlist success message appears")
    public void checkSuccessMessageIsDisplayed()
    {
        softAssert.assertTrue(homePage.wishlistSuccessMsg().isDisplayed());
        softAssert.assertAll();
    }

    @And("Success message background colour is green")
    public void checkSuccessMessageIsGreen(){
        String messageColor = homePage.wishlistSuccessMsg().getCssValue("background-color");
        softAssert.assertEquals(Color.fromString(messageColor).asHex(),"#4bb07a");
        softAssert.assertAll();
    }

    @And("wait wishlist success message to disappear")
    public void waitMessageToDisappeared(){
        new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
    }

    @Then("user clicks on WishList tab")
    public void clickWishListTab(){
        homePage.wishListTab().click();
    }

    @And("Qty value is bigger than 0")
    public void checkQtyValue(){
        String qty = homePage.quantity().getAttribute("value");
        softAssert.assertNotEquals(qty,"0");
        softAssert.assertAll();
    }
}
