

Feature:As a user, I want to see edit car info icons from the Vehicle page.

  Background: User is already in the log in page
    Given the user is on the login page

@wip1
  Scenario Outline: Verify that user can see the edit car icons
    Given the user logged in as "<userType>"
    When User clicks on Fleet module
    When User goes to Vehicle page
    And hover over to the edit icons
    Then user should she view edit and delete

  Examples:
    |  userType   |
    |   driver    |
    |sales manager|
  #  |store manager|