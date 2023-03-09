

Feature: Customers account page functionality test

  User Story:  As a user, I want to filter customers’ info on the Account page.
  Background: User is already in the log in page
    Given the user is on the login page

  @account
    Scenario: User accesses the homepage
      Given the user is on the login page
      When User enters login credentials
      Then User is taken to the homepage



      Scenario: Users should see 8 filter items on the Accounts page
        Given the user is on the home page
        When user clicks customer tab on the top left module
        Then User clicks on accounts tab
        Then User is able to see all of the filters on the account page

