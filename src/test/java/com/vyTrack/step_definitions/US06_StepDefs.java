package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.US06_MainModulesPage_Na;
import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US06_StepDefs extends BasePage {


    US06_MainModulesPage_Na us06_mainModulesPage_na = new US06_MainModulesPage_Na();
    @When("User clicks on Fleet module")
    public void user_clicks_on_fleet_module() {


        for (WebElement eachModule : menuOptions) {
            String moduleName = eachModule.getText();

            if (moduleName.contains("Fleet")) {
                // System.out.println("Module name = " + eachModule.getText());
                BrowserUtils.waitForClickablility(eachModule,3);
                eachModule.click();
                /* try {
                     eachModule.click();
                 }catch(ElementClickInterceptedException e){
                     //System.out.println("Module name = " + eachModule.getText());
                     eachModule.click();
                 }

                 */

                break;
            }
            BrowserUtils.waitForClickablility(us06_mainModulesPage_na.driverFleet,7);
            us06_mainModulesPage_na.driverFleet.click();
        }
    }



    @When("User goes to Vehicle page")
    public void user_goes_to_vehicle_page() {
        us06_mainModulesPage_na.driverVehicle.click();

    }

    @When("hover over to the edit icons")
    public void hover_over_to_the_edit_icons() {

        Actions actions = new Actions(Driver.getDriver());

        WebElement editIcons = us06_mainModulesPage_na.hoverBox;

        BrowserUtils.waitFor(4);
        actions.moveToElement(editIcons).perform();
        BrowserUtils.waitFor(4);


    }

    @Then("user should she view edit and delete")
    public void userShouldSheViewEditAndDelete() {

        Assert.assertTrue(us06_mainModulesPage_na.hoverBox.isDisplayed());
    }
}
