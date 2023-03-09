@login
Feature: Oronic page functionality tests

  User Story :  As a user, I should be access to the Oronic Documentation page. (Window handle)

  Background: User is already in the log in page
    Given the user is on the login page


@wip
  Scenario: Users access the oronic documentation page
    Given the user logged in as "driver"
    Given Users are on the homepage
    When click the question icon on the right top of the homepage
    Then verify the user's access to the oronic documentation page

@wip
  Scenario: Users access the oronic documentation page
    Given the user logged in as "sales manager"
    Given Users are on the homepage
    When click the question icon on the right top of the homepage
    Then verify the user's access to the oronic documentation page

@wip
  Scenario: Users access the oronic documentation page
    Given the user logged in as "store manager"
    Given Users are on the homepage
    When click the question icon on the right top of the homepage
    Then verify the user's access to the oronic documentation page