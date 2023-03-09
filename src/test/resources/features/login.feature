
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    When user clicks on Fleet button
  Then user clicks on Vehicles Model button
  Then user should see warning You do not have permission to perform this action




  Scenario: Sales manager should see 10 columns on the Vehicle Model page
    Given the user logged in as "sales manager"
    When user clicks on Fleet button
    Then user clicks on Vehicles Model button
    Then user should see MODEL NAME,CAN BE REQUESTED,CVVI,


  Scenario: Store manager should see 10 columns on the Vehicle Model page
    Given the user logged in as "store manager"
    When user clicks on Fleet button
    Then user clicks on Vehicles Model button
    Then user should see MODEL NAME,CAN BE REQUESTED,CVVI,




