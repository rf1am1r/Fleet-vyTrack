package com.vyTrack.step_definitions;

import com.vyTrack.pages.CalendarEventsPage;
import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class US09_Calendar_Event_Error_Message_StepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


    @When("the user goes to the Calendar Events page")
    public void the_user_goes_to_the_calendar_events_page() {
        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][3]"));
        activitiesModule.click();

        WebElement calendarEvents = Driver.getDriver().findElement(By.linkText("Calendar Events"));
        calendarEvents.click();

    }
    @When("the user creates the calendar event")
    public void the_user_creates_the_calendar_event() {


        BrowserUtils.waitFor(2);
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEventButton, 5);
        calendarEventsPage.createCalendarEventButton.click();

       //BrowserUtils.waitFor(2);
       // this is the dynamic element, that's why we need to handle, otherwise we'll get NSEException, refer to the POM(CalendarEventsPage)
       calendarEventsPage.repeatRadioButton.click();





    }
    @When("the user enters the value less than {int}")
    public void the_user_enters_the_value_less_than(Integer int1) {

        BrowserUtils.waitForVisibility(calendarEventsPage.repeatInput, 2);

        Actions actions = new Actions(Driver.getDriver());
        // in here we need to delete the value of 1 first and then send our keys
        // double click will allow me to delete the default content '1'
        actions.doubleClick(calendarEventsPage.repeatInput).sendKeys("-1").perform();



        calendarEventsPage.saveAndCloseButton.click();
        BrowserUtils.waitFor(2);


        String errorMessage = calendarEventsPage.repeatInputErrorMessage.getText();
        System.err.println("errorMessage = " + errorMessage);



    }
    @Then("the user sees the error message {string}")
    public void the_user_sees_the_error_message(String actualErrorMessage) {

        String expectedErrorMessage = Driver.getDriver().findElement(By.xpath("//span[text()='The value have not to be less than 1.']")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }
}
