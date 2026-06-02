Feature: Add product to cart

  Scenario: Add available product to cart
    Given the customer is logged in
    And the product is available
    When the customer adds the product to the cart
    Then the product should be added to the cart

  Scenario: Add unavailable product to cart
    Given the customer is logged in
    And the product is out of stock
    When the customer adds the product to the cart
    Then an out of stock message should be displayed

  Scenario: Add product without login
    Given the customer is not logged in
    When the customer adds the product to the cart
    Then the system should ask the customer to login

  Scenario: Add product with invalid quantity
    Given the customer is logged in
    And the customer enters invalid quantity
    When the customer adds the product to the cart
    Then a quantity validation message should be displayed

  Scenario: Add multiple products to cart
    Given the customer is logged in
    And several products are available
    When the customer adds multiple products to the cart
    Then all selected products should be added to the cart