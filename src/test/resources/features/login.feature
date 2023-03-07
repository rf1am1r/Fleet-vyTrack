@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    #Given the user logged in with username as "User1" and password as "UserUser123"

   @driver
  Scenario: User "driver" successfully login to the application
    Given the user is on the login page
    When the user enters valid "driver_username" and "driver_password"
    Then the user successfully logs in to the "Dashboard" page



