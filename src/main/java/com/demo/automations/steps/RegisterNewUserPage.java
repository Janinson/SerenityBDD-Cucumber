package com.demo.automations.steps;

import com.demo.automations.models.DataUser;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterNewUserPage {

    String successfulMessageStr = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
    com.demo.automations.pageobjects.RegisterNewUserPage registerNewUserPage = new com.demo.automations.pageobjects.RegisterNewUserPage();

    @Step
    public void fillContactInformationFields(DataUser data){
        registerNewUserPage.setFirstName(data.getFirstName());
        registerNewUserPage.setLastName(data.getLastName());
        registerNewUserPage.setPhoneNumber(data.getPhoneNumber());
        registerNewUserPage.setEmailAddress(data.getEmailAddress());
        registerNewUserPage.setUserName(data.getUsername());
        registerNewUserPage.setPassword(data.getPassword());
        registerNewUserPage.setConfirmPassword(data.getPassword());
        registerNewUserPage.sendInformation();
    }

    @Step
    public void successfulMessage(){
        Assert.assertEquals(successfulMessageStr, registerNewUserPage.successfulRegistrationMessage());
    }
}
