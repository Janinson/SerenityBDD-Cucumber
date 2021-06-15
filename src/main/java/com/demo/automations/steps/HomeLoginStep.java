package com.demo.automations.steps;

import com.demo.automations.models.DataUser;
import com.demo.automations.pageobjects.HomeLoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeLoginStep {

    HomeLoginPage homeLoginPage = new HomeLoginPage();

    @Step
    public void getLoginPage(){
        homeLoginPage.signinLinkClick();
    }

    @Step
    public void signinMercuryTours(DataUser data){
        homeLoginPage.setUserNameSigninSection(data.getUsername());
        homeLoginPage.setPasswordSigninSection(data.getPassword());
    }

    @Step
    public void sendCredentials(){
        homeLoginPage.submitClick();
    }

    @Step
    public void compareSuccessMessage(){
        Assert.assertEquals("Thank you for Loggin.", homeLoginPage.loginSuccessfullyMessage());
    }
}
