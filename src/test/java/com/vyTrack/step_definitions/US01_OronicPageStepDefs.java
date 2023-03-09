package com.vyTrack.step_definitions;

import com.vyTrack.pages.Oronic_Page_KE;
import com.vyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_OronicPageStepDefs {

    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {
        BrowserUtils.sleep(2);

        BrowserUtils.verifyTitle("Dashboard");

        System.out.println("Users are on the homepage");

    }
    Oronic_Page_KE oronic_page_ke = new Oronic_Page_KE();
    @When("click the question icon on the right top of the homepage")
    public void click_the_question_icon_on_the_right_top_of_the_homepage() {
        BrowserUtils.sleep(2);
        oronic_page_ke.helpButton.click();
        System.out.println("click the question icon on the right top of the homepage");
    }
    @Then("verify the user's access to the oronic documentation page")
    public void verify_the_user_s_access_to_the_oronic_documentation_page() {

        BrowserUtils.sleep(2);

        BrowserUtils.switchToWindow("Welcome to Oro Documentation");

        System.out.println("verify the user's access to the oronic documentation page");
    }




}
