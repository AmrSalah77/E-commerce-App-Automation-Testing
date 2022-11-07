@smoke
Feature: F08_WishList | users could add product to wishList

  Scenario: user click on wishList
    When user clicks on wishList button
    Then wishlist success message appears
    And Success message background colour is green

  Scenario: user opens wishlist tab
    When user clicks on wishList button
    And wait wishlist success message to disappear
    Then user clicks on WishList tab
    And Qty value is bigger than 0