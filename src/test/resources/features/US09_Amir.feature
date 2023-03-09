@US09_Amir
Feature: Users should see an error message when entering invalid integer in the calendar event
  Agile User Story:  As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.
  Background: User is already in the log in page
    Given the user is on the login page

  @lessThan
  Scenario Outline: Verify user sees an error message for entering invalid integers
    Given the user logged in as "<userType>"
    When the user goes to the Calendar Events page
    And the user creates the calendar event
    And the user enters the value less than 1
    Then the user sees the error message "The value have not to be less than 1."

    Examples:
      |  userType   |
      |   driver    |
      |sales manager|
      |store manager|

  @greaterThan
  Scenario Outline: Verify user sees an error message for entering invalid integers
    Given the user logged in as "<userType>"
    When the user goes to the Calendar Events page
    And the user creates the calendar event
    And the user enters the value greater than 99
    Then the user sees the error message "The value have not to be more than 99."

    Examples:
  |  userType   |
  |   driver    |
  |sales manager|
  |store manager|

    #be careful of the 'more than 100 and more than 99' parts!!!
    #create separate values