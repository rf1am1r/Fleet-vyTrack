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

    @When("User enters login credentials")
    public void user_enters_login_credentials() {

        Driver.getDriver().get(ConfigurationReader.getProperty("login_page"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("truck_user"));
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("truck_password"));
        Driver.getDriver().findElement(By.name("_submit")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[2]")).click();
        Driver.getDriver().findElement(By.linkText("Accounts")).click();
        Driver.getDriver().findElement(By.xpath("//a[@class='action btn mode-icon-only']")).click();
    }
}