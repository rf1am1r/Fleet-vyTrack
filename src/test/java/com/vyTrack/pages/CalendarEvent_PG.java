package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEvent_PG extends BasePage{


    public CalendarEvent_PG(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;


    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;



    @FindBy(className = "recurrence-subview-control__number")
    public WebElement repeatInput;


    @FindBy(xpath = "//button[@type='submit'][1]")
    public WebElement saveAndCloseButton;



    //to locate an element with dynamic id, by using its static part
    @FindBy(xpath = "//*[contains(@id, 'temp-validation-name-')]")
    public WebElement repeatInputErrorMessage;




}

