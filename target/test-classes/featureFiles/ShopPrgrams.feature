Feature: This feature is to test the demo app for nutrisense

  Scenario: Verify the quick link functionality
    Given user opens "https://www.nutrisense.io/" in "chrome" browser
    When user click on "Shop Programs" menu
    Then user can see the Quick Links section displayed
