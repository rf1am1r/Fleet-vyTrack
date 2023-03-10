@US04
Feature: the Vehicle contracts page
  Agile Story: As a user, I want to access to Vehicle contracts page

@ac1
  Scenario: Managers access the Vehicle contracts page
    Given  user logins as store or sales manager
    When user clicks the Vehicle contracts under the Fleet
    Then user verifies managers can access the Vehicle contracts page
@ac2
  Scenario: Drivers can NOT access the Vehicle contracts page
    Given user logins as drivers
    When user clicks the Vehicle contracts under the Fleet
    Then user verifies an error message: You do not have permission to perform this action.;