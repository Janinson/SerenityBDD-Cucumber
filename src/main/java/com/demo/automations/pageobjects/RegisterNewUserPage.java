package com.demo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterNewUserPage extends PageObject {

    By firstNameInputLocator = By.xpath("//input[@name='firstName']");
    By lastNameInputLocator = By.xpath("//input[@name='lastName']");
    By phoneNumberInputLocator = By.xpath("//input[@name='phone']");
    By emailAddressInputLocator = By.id("userName");

    By userNameInputLocator = By.id("email");
    By passwordInputLocator = By.xpath("//input[@name='password']");
    By confirmPasswordInputLocator = By.xpath("//input[@name='confirmPassword']");

    By submitButtonLocator = By.xpath("//input[@name='submit']");

    public void setFirstName(String firstName){
        getDriver().findElement(firstNameInputLocator).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        getDriver().findElement(lastNameInputLocator).sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber){
        getDriver().findElement(phoneNumberInputLocator).sendKeys(phoneNumber);
    }

    public void setEmailAddress(String emailAddress){
        getDriver().findElement(emailAddressInputLocator).sendKeys(emailAddress);
    }

    public void setUserName(String userName){
        getDriver().findElement(userNameInputLocator).sendKeys(userName);
    }

    public void setPassword(String password){
        getDriver().findElement(passwordInputLocator).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        getDriver().findElement(confirmPasswordInputLocator).sendKeys(confirmPassword);
    }

    public void sendInformation(){
        getDriver().findElement(submitButtonLocator).click();
    }

    public String successfulRegistrationMessage(){
        List<WebElement> fonts = getDriver().findElements(By.tagName("font"));
        return fonts.get(4).getText();
    }
}
