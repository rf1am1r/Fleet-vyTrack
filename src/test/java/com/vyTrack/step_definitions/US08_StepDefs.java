package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.CalendarEvent_PG;
import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.Optional;

public class US08_StepDefs extends BasePage {

    CalendarEvent_PG calendarEvent_pg = new CalendarEvent_PG();

    Actions actions = new Actions(Driver.getDriver());

    @When("Click the Calendar Events under the Activities")
    public void clickTheCalendarEventsUnderTheActivities() {
        for (WebElement eachModule : menuOptions) {
            String moduleName = eachModule.getText();

            if(moduleName.contains("Activities")){
                // System.out.println("Module name = " + eachModule.getText());
                BrowserUtils.waitFor(2);
                eachModule.click();
               /* try {
                    eachModule.click();
                }catch(ElementClickInterceptedException e){
                    //System.out.println("Module name = " + eachModule.getText());
                    eachModule.click();
                }*/
                break;
            }

        }


        BrowserUtils.waitForClickablility(calendarEvents,7);
        calendarEvents.click();

    }


    @And("Click the Create Calendar Event button")
    public void clickTheCreateCalendarEventButton() {

        BrowserUtils.waitForClickablility(calendarEvent_pg.createCalendarEventButton,5);
        calendarEvent_pg.createCalendarEventButton.click();

    }

    @And("Check the Repeat checkbox")
    public void checkTheRepeatCheckbox() {
  BrowserUtils.waitForVisibility(calendarEvent_pg.repeatCheckBox,5);
        calendarEvent_pg.repeatCheckBox.click();
    }

    @Then("Verify the repeat number is {int}")
    public void verifyTheRepeatNumberIs(int actualDefaultNumber) {

        Integer expectedDefaultNumber = Integer.valueOf(calendarEvent_pg.repeatInput.getAttribute("value"));
        Assert.assertEquals(Optional.of(actualDefaultNumber),expectedDefaultNumber);


    }

    @Then("Clear\\(delete) the number {int}")
    public void clearDeleteTheNumber(int DefaultNumber) {
        BrowserUtils.waitForVisibility(calendarEvent_pg.repeatInput,5);
        actions.doubleClick(calendarEvent_pg.repeatInput).sendKeys(Keys.CLEAR).perform();
    }


    @And("Verify the app displays {string}")
    public void verifyTheAppDisplays(String actualErrorMessage) {

        String expectedErrorMessage = calendarEvent_pg.repeatInputErrorMessage.getText();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }
}
