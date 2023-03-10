package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.US01_Mehmet_Pages;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.vyTrack.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_Mehmet_StepDefs extends BasePage {


    LoginPage loginPage= new LoginPage();
    US01_Mehmet_Pages us01_mehmet_pages=new US01_Mehmet_Pages();

   /*
   @Given("the user logged in as {string}")
    public void user_should_login_as_store_manager() {

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username")+ Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password")+ Keys.ENTER);
        loginPage.submit.click();


    }

    */

    @Then("Store manager should view eight module")
    public void store_manager_should_view_module() {

        List<String> modules = new ArrayList<>();

        modules.add("Dashboards");
        modules.add("Fleet");
        modules.add("Customers");
        modules.add("Sales");
        modules.add("Activities");
        modules.add("Marketing");
        modules.add("Reports & Segments");
        modules.add("System");


        System.out.println("modules = " + modules);

        List<String> list= new ArrayList<>();
        for (WebElement each : menuOptions) {

            list.add(each.getText());
            System.out.println("each.getText() = " + each.getText());
        }

        Assert.assertEquals(list,modules);



    }


    @Then("Sales manager should view eight module")
    public void sales_manager_should_view_module() {
        List<String> modules = new ArrayList<>();

        modules.add("Dashboards");
        modules.add("Fleet");
        modules.add("Customers");
        modules.add("Sales");
        modules.add("Activities");
        modules.add("Marketing");
        modules.add("Reports & Segments");
        modules.add("System");


        System.out.println("modules = " + modules);

        List<String> list1= new ArrayList<>();
        for (WebElement each : menuOptions) {

            list1.add(each.getText());
            System.out.println("each.getText() = " + each.getText());
        }

        Assert.assertEquals(list1,modules);

    }



    @Then("Drivers should view four module")
    public void drivers_should_view_module() {
        List<String> modules1 = new ArrayList<>();




        modules1.add("Fleet");
        modules1.add("Customers");
        modules1.add("Activities");
        modules1.add("System");

        System.out.println("modules = " + modules1);

        List<String> list2= new ArrayList<>();
        for (WebElement each : us01_mehmet_pages.driversPage) {

            list2.add(each.getText());
            System.out.println("each.getText() = " + each.getText());
        }

        Assert.assertTrue(list2.containsAll(modules1));
    }




}
