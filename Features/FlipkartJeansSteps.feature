Feature: Flipkart Jeans Selection

  Scenario: Select and verify jeans item from Flipkart
    Given I launch Flipkart website
    When I hover over Fashion > Kids > Boys & Girls Jeans
    And I sort by Price Low to High
    And I select a jeans item
    And I fetch item name and price
    And I add item to cart
    Then Item details in checkout match