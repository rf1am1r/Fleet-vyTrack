

Feature: User should be able to access all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page


@wip
  Scenario: Store managers should view 8 module names.
    Given User should login as Store manager
    Then Store manager should view 8 module


  @wip
  Scenario: Sales Manager should view 8 module names.
    Given User should login as Sales manager
    Then Sales manager should view 8 module


  @wip
  Scenario: Driver should view 4 module names.
    Given User should login as Driver
    Then Drivers should view 4 module











