package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));

    @When("user opens facebook link")
    public void clickFacebookLink(){
        homePage.facebookIcon().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expectedLink) {
        new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(homePage.getCurrentUrl(),expectedLink);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        homePage.twitterIcon().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homePage.rssIcon().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.youtubeIcon().click();
    }
}
