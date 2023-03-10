package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oronic_Page_KE {

    public Oronic_Page_KE(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "fa-question-circle")
    public WebElement helpButton;



}
