@login
Feature:Pinbar functionality tests

  Agile story: As a user, I want to learn how to use the pinbar.

  Background:
    Given the user is on the login page

  @wip
  Scenario: Users Learn How To Use The Pinbar
    Given the user logged in as "driver"
    Given Users are on the homepage
    When Users click the Learn how to use this space message
    And  Verify Users sees How To Use Pinbar
    Then Verify Users sees Use the pin icon on the right top corner of the page to create fast access link in the pinbar

  @wip
  Scenario: Users see an image on the pinbar page
    Given the user logged in as "driver"
    Given Users are on the homepage
    When  Users click the Learn how to use this space message
    Then  Verify Users see an image