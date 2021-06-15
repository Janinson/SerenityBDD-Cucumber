package com.demo.automations.stepdefinitions;

import com.demo.automations.models.DataUser;
import com.demo.automations.steps.HomeLoginStep;
import com.demo.automations.steps.HomePageStep;
import com.demo.automations.steps.RegisterNewUserPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomePageStep homePageStep;
    @Steps
    RegisterNewUserPage registerNewUserPage;
    @Steps
    HomeLoginStep homeLoginStep;

    @Given("^the user enters the registration page$")
    public void theUserEntersTheRegistrationPage() {
        homePageStep.openBrowser();
        homePageStep.selectRegisterLink();
    }

    @When("^the user enters the information$")
    public void theUserEntersTheInformation(List<DataUser> dataList) {
        registerNewUserPage.fillContactInformationFields(dataList.get(0));
    }

    @Then("^you can see the welcome text on the screen$")
    public void youCanSeeTheWelcomeTextOnTheScreen(List<DataUser> dataList) throws InterruptedException  {
        registerNewUserPage.successfulMessage();
        homeLoginStep.getLoginPage();
        Thread.sleep(3000);
        homeLoginStep.signinMercuryTours(dataList.get(0));
        homeLoginStep.sendCredentials();
        homeLoginStep.compareSuccessMessage();
    }

}
