package com.vyTrack.step_definitions;

import com.vyTrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.vyTrack.pages.LoginPage;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class US01_Mehmet_StepDefs {


    LoginPage loginPage= new LoginPage();

    @Given("User should login as Store manager")
    public void user_should_login_as_store_manager() {

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username")+ Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password")+ Keys.ENTER);
        loginPage.submit.click();


    }

    @Then("Store manager should view eight module")
    public void store_manager_should_view_module() {

        List<String> modules = new ArrayList<>();

        modules.add("Dashboards");
        modules.add("Fleet");
        modules.add("Costumers");
        modules.add("Sales");
        modules.add("Activities");
        modules.add("Marketing");
        modules.add("Reports & Segments");
        modules.add("System");

    }

    @Given("User should login as Sales manager")
    public void user_should_login_as_sales_manager() {

    }

    @Then("Sales manager should view eight module")
    public void sales_manager_should_view_module() {

    }

    @Given("User should login as Driver")
    public void user_should_login_as_driver() {

    }

    @Then("Drivers should view four module")
    public void drivers_should_view_module() {

    }





}
