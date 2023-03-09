package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_MainModulesPage_Na {

    public US06_MainModulesPage_Na(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
   // public WebElement driverFleet;
    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement driverFleet;


    @FindBy(xpath = "//span[normalize-space()='Vehicles']")
    public WebElement driverVehicle;


    @FindBy(xpath = "(//div[@class = 'dropdown'])[1]")
    public WebElement hoverBox;





}
