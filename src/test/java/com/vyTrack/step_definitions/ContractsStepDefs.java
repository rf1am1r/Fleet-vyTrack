package com.vyTrack.step_definitions;


import com.vyTrack.pages.ContractPage;
import com.vyTrack.pages.LoginPage;
import com.vyTrack.pages.BasePage;
import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContractsStepDefs {

    @Given("user logins as store or sales manager")
    public void userLoginsAsStoreOrSalesManager() {
        new LoginPage().login("storemanager51", "UserUser123");

    }

    @When("user clicks the Vehicle contracts under the Fleet")
    public void userClicksTheVehicleContractsUnderTheFleet() {

        for (WebElement eachModule : new BasePage().menuOptions) {
            String moduleName = eachModule.getText();
            if (moduleName.equalsIgnoreCase("Fleet")) {
                try {
                    eachModule.click();
                } catch (ElementClickInterceptedException e) {
                    eachModule.click();
                }
                break;
            }
        }

        System.out.println("new BasePage().vehicleContractsOption.getText() = " + new BasePage().vehicleContractsOption.getText());
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(new BasePage().vehicleContractsOption).click().perform();
        BrowserUtils.waitFor(10);
    }

    @Then("user verifies managers can access the Vehicle contracts page")
    public void userVerifiesManagersCanAccessTheVehicleContractsPage() {

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String expectedUrl = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String actualTitle = Driver.getDriver().getTitle();


        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        //BrowserUtils.verifyURLContains(expectedUrl);

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Given("user logins as drivers")
    public void userLoginsAsDrivers() {
        new LoginPage().login("user1", "UserUser123");
    }

    @Then("user verifies an error message: You do not have permission to perform this action.;")
    public void userVerifiesAnErrorMessageYouDoNotHavePermissionToPerformThisAction() {
        new ContractPage().errorMessage.isDisplayed();
        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = new ContractPage().errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
