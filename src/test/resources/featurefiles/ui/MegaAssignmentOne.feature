@ui
Feature: Mega Assignment One Test

  Scenario: Verify a.txt can be created
    Given The user is on landing page
    When The user enters username and password
    And The user clicks the login button
    Then The user navigated to the home page
    Then The user creates a new text file
    Then Enters the content megatesting
    Then Saves the new text file
    Then Verify a.txt is created

    Scenario: Verify a.txt is deleted
      Given The user is already logged in
      When user finds the text file