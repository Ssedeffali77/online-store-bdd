Feature: Create order

  Scenario: Successful order creation
    Given the customer has products in the cart
    When the customer places the order
    Then the order should be created successfully

  Scenario: Create order with empty cart
    Given the cart is empty
    When the customer places the order
    Then an empty cart message should be displayed

  Scenario: Create order with invalid payment
    Given the customer has products in the cart
    And the payment is invalid
    When the customer places the order
    Then a payment error message should be displayed

  Scenario: Create order with valid payment
    Given the customer has products in the cart
    And the payment is valid
    When the customer places the order
    Then the payment should be processed successfully

  Scenario: Guest user attempts to create order
    Given the user is not logged in
    When the user places an order
    Then the system should request login