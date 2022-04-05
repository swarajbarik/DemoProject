Feature: This feature is to test the demo app

  Scenario: Verify the landing page for demoqa app
    Given user opens "https://shop.demoqa.com/" in "chrome" browser
    When user click on dismiss message
    Then user verify the right corner should display the below links
      | My Wishlist | My Account | Checkout |
