Feature: Login Functionality for OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the OpenCart login page

  @Smoke
  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When Click on the login button
    Then I should be logged in successfully

  @Smoke
  Scenario: Navigating to the forgotten password page
    When On clicking the "Forgotten Password" link
    Then User should be redirected to the password reset page

  @Regression
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given Enter invalid "<username>" and "<password>"
    When  Click on the login button
    Then  Error message indicating "<error_message>" should be displayed

    Examples:
      | username          | password        | error_message                                         |
      | invalid@email.com | invalidPassword | Warning: No match for E-Mail Address and/or Password. |
      | abcccc            | validPassword   | Warning: No match for E-Mail Address and/or Password. |
