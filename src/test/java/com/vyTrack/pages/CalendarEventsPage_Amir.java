package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage_Amir {

    public CalendarEventsPage_Amir(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;


    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatRadioButton;



    @FindBy(className = "recurrence-subview-control__number")
    public WebElement repeatInput;


    @FindBy(xpath = "//button[@type='submit'][1]")
    public WebElement saveAndCloseButton;



    //to locate an element with dynamic id, by using its static part
    @FindBy(xpath = "//*[contains(@id, 'temp-validation-name-')]")
    public WebElement repeatInputErrorMessage;



}