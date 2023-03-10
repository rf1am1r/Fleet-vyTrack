package com.vyTrack.step_definitions;

import com.vyTrack.pages.US03_VyTrackPinbarPage;
import com.vyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US03_PinbarStepDefs {

    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {
        BrowserUtils.verifyTitle("Dashboard");
        System.out.println("Users are on the homepage");
    }

    US03_VyTrackPinbarPage vyTrackPinbarPage = new US03_VyTrackPinbarPage();
    @When("Users click the Learn how to use this space message")
    public void users_click_the_learn_how_to_use_this_space_message() {
        vyTrackPinbarPage.learnHowToUseThisSpaceButton.click();
    }
    @When("Verify Users sees How To Use Pinbar")
    public void verify_users_sees_how_to_use_pinbar() {

        String actualText =  vyTrackPinbarPage.howToUsePinbarText.getText();
        String expectedText= "How To Use Pinbar";

        Assert.assertEquals(actualText,expectedText);

    }
    @Then("Verify Users sees Use the pin icon on the right top corner of the page to create fast access link in the pinbar")
    public void verify_users_sees_use_the_pin_icon_on_the_right_top_corner_of_the_page_to_create_fast_access_link_in_the_pinbar() {

        String actualText=vyTrackPinbarPage.UsePinIconOnTheTightTopCornerOfPageToCreateFastAccessLinkInThePinbarText.getText();
        String expectedText="Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualText,expectedText);

    }
    @Then("Verify Users see an image")
    public void verifyUsersSeeAnImage() {
        BrowserUtils.waitForVisibility(vyTrackPinbarPage.image,5);
        vyTrackPinbarPage.image.isDisplayed();
        Assert.assertTrue(vyTrackPinbarPage.image.isDisplayed());
    }
}