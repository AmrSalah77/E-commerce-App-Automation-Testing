@smoke
Feature: F05_hoverCategories | users could use Hover categories functionality
  Scenario: user hover on a category and select sub-category
    Given user hover on categories
    When user select a random sub-category
    Then sub-category page is opened successfully
