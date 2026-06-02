Feature: Login functionality

  Scenario: Successful login
    Given the user enters valid username and password
    When the user clicks the login button
    Then the user should be logged in successfully

  Scenario: Login with wrong password
    Given the user enters invalid password
    When the user clicks the login button
    Then an error message should be displayed

  Scenario: Login with empty username
    Given the username field is empty
    When the user clicks the login button
    Then a validation message should be displayed

  Scenario: Login with empty password
    Given the password field is empty
    When the user clicks the login button
    Then a validation message should be displayed

  Scenario: Admin login
    Given the admin enters valid credentials
    When the admin clicks the login button
    Then the admin should be logged in successfully