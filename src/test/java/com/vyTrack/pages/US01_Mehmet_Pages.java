package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_Mehmet_Pages {



    public US01_Mehmet_Pages(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> mainPage;



}
