Feature: sell one item

  As a cashier,
  I want to sell an item that a customer brings to checkout
  so that they can purchase it

  A/C
  - Product found scan -> displays the price
  - Product not found scan -> displays “not found” message
  - Bad scan displays error message
  - Add sales tax

  Scenario: Display price if scanned item is found
    Given a light bulb with id 12455 and price 2.75
    And a clock with id 43120 and price 30.10
    When product id 12455 is scanned
    Then the scanned item price should be 2.75

  Scenario: Inform if product not found

  Scenario: Inform on scanning error

  Scenario: Add sales tax
