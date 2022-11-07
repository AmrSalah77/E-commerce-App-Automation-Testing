@smoke
Feature: F03_currencies | users could use change currencies
  Scenario: user could change currencies
    When user select Euro currency
    Then Euro Symbol is shown on the four products in the Home page
