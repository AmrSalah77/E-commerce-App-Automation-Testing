@smoke
Feature: F04_search | users could use search functionality

  Scenario Outline: user could search for product by name
    When user search by product name "<productName>"
    Then user gets redirected to search page
    And Search page contains relevant results

    Examples:
      | productName |
      | book        |
      | laptop      |
      | nike        |

  Scenario Outline: user could search for product by sku
    When user search by sku "<sku>"
    And user selects the product
    Then product page contains the same sku

    Examples:
      | sku        |
      | SCI_FAITH  |
      | APPLE_CAM  |
      | SF_PRO_11  |