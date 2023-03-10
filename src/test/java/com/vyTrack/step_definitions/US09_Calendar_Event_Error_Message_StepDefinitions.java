package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.CalendarEventsPage_Amir;

import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US09_Calendar_Event_Error_Message_StepDefinitions extends BasePage {

    CalendarEventsPage_Amir calendarEventsPage = new CalendarEventsPage_Amir();
    Actions actions = new Actions(Driver.getDriver());


    @When("the user goes to the Calendar Events page")
    public void the_user_goes_to_the_calendar_events_page() {

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


    @When("the user creates the calendar event")
    public void the_user_creates_the_calendar_event() {

        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEventButton, 5);
        calendarEventsPage.createCalendarEventButton.click();


       // this is the dynamic element, that's why we need to handle, otherwise we'll get NSEException, refer to the POM(CalendarEventsPage)
       calendarEventsPage.repeatRadioButton.click();

    }



    @When("the user enters the value less than 1")
    public void the_user_enters_the_value_less_than() {

        BrowserUtils.waitForVisibility(calendarEventsPage.repeatInput, 2);


        // in here we need to delete the value of 1(default value) first and then send our keys
        // double click will allow me to delete the default content '1'
        actions.doubleClick(calendarEventsPage.repeatInput).sendKeys(ConfigurationReader.getProperty("repeat_input_lessThan")).perform();



        calendarEventsPage.saveAndCloseButton.click();
        BrowserUtils.waitFor(2);


        String errorMessage = calendarEventsPage.repeatInputErrorMessage.getText();
        System.err.println("errorMessage = " + errorMessage);

    }



    @Then("the user sees the error message {string}")
    public void the_user_sees_the_error_message(String actualErrorMessage) {

        String expectedErrorMessage = calendarEventsPage.repeatInputErrorMessage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }




    //second scenario

    @When("the user enters the value greater than 99")
    public void the_user_enters_the_value_greater_than() {

        BrowserUtils.waitForVisibility(calendarEventsPage.repeatInput, 3);

        actions.doubleClick(calendarEventsPage.repeatInput).sendKeys(ConfigurationReader.getProperty("repeat_input_greaterThan")).perform();

        calendarEventsPage.saveAndCloseButton.click();
        BrowserUtils.waitForVisibility(calendarEventsPage.repeatInputErrorMessage,3);

        String errorMessage = calendarEventsPage.repeatInputErrorMessage.getText();
        System.err.println("errorMessage = " + errorMessage);


    }





}