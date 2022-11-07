package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_registerPage {
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement pickMaleGender(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public Select DateOfBirthDay ()
    {
        return new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]")));
    }
    public Select DateOfBirthMonth ()
    {
        return new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]")));
    }
    public Select DateOfBirthYear ()
    {
        return new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]")));
    }
    public WebElement email(){
        return Hooks.driver.findElement(By.name("Email"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement registerMessage(){
        return Hooks.driver.findElement(By.className("result"));
    }
    public String getMsgColor(){
        return Hooks.driver.findElement(By.className("result")).getCssValue("color");
    }
}
