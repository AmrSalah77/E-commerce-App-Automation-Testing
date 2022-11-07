package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {

    public Select currencySelector()
    {
        return new Select(Hooks.driver.findElement(By.id("customerCurrency")));
    }

    public List<WebElement> products(){
        return Hooks.driver.findElements(new By.ByCssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement searchBox(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchedWord(){
        return Hooks.driver.findElement(By.id("q"));
    }

    public WebElement searchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> productName(){
        return Hooks.driver.findElements(By.xpath("//div[@class='details']"));
    }

    public WebElement productSku(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]"));
    }

    public WebElement productTitleSku(){
        return Hooks.driver.findElement(By.className("product-title"));
    }

    public String getCurrentUrl() {
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement mainCategories(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }

    public WebElement sub_categories(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }

    public WebElement pageTitle(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public WebElement firstSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[style=\"display: block;\"]"));
    }

    public WebElement secondSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[style=\"display: none;\"]"));
    }

    public WebElement facebookIcon(){
        return Hooks.driver.findElement(By.className("facebook"));
    }

    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.className("twitter"));
    }

    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.className("rss"));
    }

    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.className("youtube"));
    }

    public WebElement wishListButton(){
        List<WebElement> buttonsList = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        return buttonsList.get(2);
    }

    public WebElement wishlistSuccessMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
    }

    public WebElement wishListTab(){
        return Hooks.driver.findElement(By.xpath("//span[@class=\"wishlist-label\"] "));
    }

    public WebElement quantity(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
    }

}
