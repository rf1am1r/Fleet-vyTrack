@US08
Feature: Calendar Event functionality tests
    User Story:
    As a user, I want to create a recurring(repetitive) calendar event.
  Agile User Story:  As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.
  Background: User is already in the log in page
    Given the user is on the login page

  @Default
  Scenario Outline: Verify user sees the default repeat day as 1
    Given the user logged in as "<userType>"
    When Click the Calendar Events under the Activities
    And Click the Create Calendar Event button
    And Check the Repeat checkbox
    Then Verify the repeat number is 1

    Examples:
      |  userType   |
      |   driver    |
      |sales manager|
      |store manager|



  @ErrorMessage
  Scenario Outline: Verify users clear the repeat day and see an error message
    Given the user logged in as "<userType>"
    When Click the Calendar Events under the Activities
    And Click the Create Calendar Event button
    And Check the Repeat checkbox
    Then Clear(delete) the number 1
    And Verify the app displays "This value should not be blank."

    Examples:
      |  userType   |
      |   driver    |
      |sales manager|
      |store manager|










