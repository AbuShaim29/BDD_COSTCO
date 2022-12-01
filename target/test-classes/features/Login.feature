@regression
Feature: login page validation

  Scenario: login page test
    Given user navigate to homepage
    Then user click on sign In button
    And user input email
    Then user input password
    Then click on sign in button
