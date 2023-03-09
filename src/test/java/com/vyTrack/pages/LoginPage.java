package com.vyTrack.pages;


import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;



    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

@FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicles Model']")
    public WebElement vehiclesModelButton;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement warningText;

@FindBy(xpath = "//thead[@class='grid-header']//th//span[@class='grid-header-cell__label']")
    public List <WebElement> tableMenu;

}
