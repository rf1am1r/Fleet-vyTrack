package com.vyTrack.step_definitions;

import com.vyTrack.pages.LoginPage;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }





    @When("user clicks on Fleet button")
    public void userClicksOnFleetButton() {
        loginPage.fleetButton.click();

    }

    @Then("user clicks on Vehicles Model button")
    public void userClicksOnVehiclesModelButton() {

        loginPage.vehiclesModelButton.click();
    }


    @Then("user should see warning You do not have permission to perform this action")
    public void userShouldSeeWarningYouDoNotHavePermissionToPerformThisAction() throws InterruptedException {

        String expectedWarning = "You do not have permission to perform this action.";
        String actualWarning = loginPage.warningText.getText();
        Thread.sleep(3);

        Assert.assertTrue(actualWarning.equals(expectedWarning));
    }

    @Then("user should see You do not have permission to perform this action")
    public void userShouldSeeYouDoNotHavePermissionToPerformThisAction() throws InterruptedException {
        Thread.sleep(3);
        Assert.assertTrue(loginPage.vehiclesModelButton.isEnabled());
    }


    @Then("user should see MODEL NAME,CAN BE REQUESTED,CVVI,")
    public void userShouldSeeMODELNAMECANBEREQUESTEDCVVI() throws InterruptedException {
        Thread.sleep(3);
        for (WebElement eachMenu : loginPage.tableMenu) {
            String actualNames = eachMenu.getText();


            String expectedNames = "MODEL NAME" +
                    "MAKE" +
                    "CAN BE REQUESTED" +
                    "CVVI" +
                    "CO2 FEE (/MONTH)" +
                    "COST (DEPRECIATED)" +
                    "TOTAL COST (DEPRECIATED)" +
                    "CO2 EMISSIONS" +
                    "FUEL TYPE" +
                    "VENDORS";
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            System.out.println("expectedNames = " + expectedNames);
            System.out.println("actualNames = " + actualNames);
            Assert.assertTrue(expectedNames.contains(actualNames));
        }

    }


}
