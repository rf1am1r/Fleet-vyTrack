

Feature: User should be able to access all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page


@Mehmet
  Scenario: Store managers should view 8 module names.
    Given the user logged in as "Store manager"
    Then Store manager should view eight module


  @Mehmet
  Scenario: Sales Manager should view 8 module names.
    Given the user logged in as "Sales manager"
    Then Sales manager should view eight module


  @Mehmet
  Scenario: Driver should view 4 module names.
    Given the user logged in as "Driver"
    Then Drivers should view four module











