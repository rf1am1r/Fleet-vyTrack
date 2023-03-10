package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractPage {

    public ContractPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="ora-subtitle")
    public WebElement contractSubtitle;

    @FindBy(xpath="//*[@id=\"flash-messages\"]/div/div/div[2]/div")
    public WebElement errorMessage;

}
