package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class P02_loginPage {
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement myAccount(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }

    public WebElement failedLoginMsg(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }


    public String getMsgColor() {
        return Color.fromString(Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color")).asHex();
    }

    public String getCurrentUrl() {
        return Hooks.driver.getCurrentUrl();
    }

}
