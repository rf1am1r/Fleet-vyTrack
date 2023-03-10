package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_VyTrackPinbarPage {

    public US03_VyTrackPinbarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[text()='Learn how to use this space']")
    public WebElement learnHowToUseThisSpaceButton;

    @FindBy(xpath= "//h3[text()='How To Use Pinbar']")
    public WebElement howToUsePinbarText;


    @FindBy(xpath="//p[1]")
    public WebElement UsePinIconOnTheTightTopCornerOfPageToCreateFastAccessLinkInThePinbarText;

    @FindBy(xpath = "//img")
    public WebElement image;

}