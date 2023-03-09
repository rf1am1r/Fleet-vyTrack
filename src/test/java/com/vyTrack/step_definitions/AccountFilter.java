package com.vyTrack.step_definitions;

import com.vyTrack.pages.AccountFilterPage;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class AccountFilter {

    AccountFilterPage accountFilter;

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_page"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("truck_user"));
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("truck_password"));
        Driver.getDriver().findElement(By.name("_submit")).click();
    }
    @When("user clicks customer tab on the top left module")
    public void user_clicks_customer_tab_on_the_top_left_module() {
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[2]")).click();

    }
    @Then("User clicks on accounts tab")
    public void user_clicks_on_accounts_tab() {
        Driver.getDriver().findElement(By.linkText("Accounts")).click();
    }
    @Then("User is able to see all of the filters on the account page")
    public void user_is_able_to_see_all_of_the_filters_on_the_account_page() {
        Driver.getDriver().findElement(By.xpath("//a[@class='action btn mode-icon-only']")).click();

    }




    }