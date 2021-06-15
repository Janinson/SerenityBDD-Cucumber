package com.demo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/test/newtours/")
public class HomePage extends PageObject {

    By registerLinkLocator = By.xpath("//a[@href='register.php']");

    public void clicRegisterLink(){
        getDriver().findElement(registerLinkLocator).click();
    }
}
