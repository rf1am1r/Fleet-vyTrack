@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    #Given the user logged in with username as "User1" and password as "UserUser123"

  @store_manager
  Scenario: Verify login with different user types
    Given the user logged in as "store manager"


  @sales_manager
  Scenario: Verify login with different user types
    Given the user logged in as "sales manager"



  @all_users @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userTypes>"

    Examples:
      |  userTypes  |
      |   driver    |
      |store manager|
      |sales manager|






