Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


@wip @driver
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    #Given the user logged in with username as "User1" and password as "UserUser123"


  @sales_manager
  Scenario: Verify login with different user types
    Given the user logged in as "sales manager"

 @store_manager
  Scenario: Verify login with different user types
    Given the user logged in as "store manager"


  @all_users @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userTypes>"

    Examples:
      |  userTypes  |
      |   driver    |
      |store manager|
      |sales manager|



  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    When user clicks on Fleet button
    Then user clicks on Vehicles Model button
    Then user should see warning You do not have permission to perform this action



  @wip1
  Scenario: Sales manager should see 10 columns on the Vehicle Model page
    Given the user logged in as "sales manager"
    When user clicks on Fleet button
    Then user clicks on Vehicles Model button
    Then user should see MODEL NAME,CAN BE REQUESTED,CVVI,

  @wip2
  Scenario: Store manager should see 10 columns on the Vehicle Model page
    Given the user logged in as "store manager"
    When user clicks on Fleet button
    Then user clicks on Vehicles Model button
    Then user should see MODEL NAME,CAN BE REQUESTED,CVVI,


 






