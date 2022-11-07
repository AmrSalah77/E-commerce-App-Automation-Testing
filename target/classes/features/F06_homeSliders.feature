@smoke
Feature: F06_homeSliders | HomePage sliders are clickable

  Scenario: user click on first slider and gets redirected to its page
    When user clicks on nokia slider
    Then user is redirected to nokia slider page

  Scenario: user click on second slider and gets redirected to its page
    When user clicks on iphone slider
    Then user is redirected to iphone slider page
