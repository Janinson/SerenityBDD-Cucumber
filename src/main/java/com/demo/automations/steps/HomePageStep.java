package com.demo.automations.steps;

import com.demo.automations.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageStep {

    HomePage homePage = new HomePage();
    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectRegisterLink(){
        homePage.clicRegisterLink();
    }
}
