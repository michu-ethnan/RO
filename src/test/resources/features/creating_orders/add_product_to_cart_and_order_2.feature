Feature: Add product to cart and order-2

  A customer should be able to add a product to cart and order it.

  Scenario: 6
    Given that Adam adds product to cart
    When he attempts to order it as person using courier delivery
    And he enters shipping address as person
    And he attempts to pay using transfer
    Then he should be on the payment page

  Scenario: 7
    Given that Adam adds product to cart
    When he attempts to order it as person using courier delivery
    And he enters shipping address as person
    And he attempts to pay using card
    Then he should be on the payment page


  Scenario: 8
    Given that Adam adds product to cart
    When he attempts to order it as person using courier delivery
    And he enters shipping address as company
    And he attempts to pay using card
    Then he should be on the payment page


  Scenario: 9
    Given that Adam adds product to cart
    When he attempts to order it as person using courier delivery
    And he attempts to pay using card
    Then he should be on the payment page

  Scenario: 10
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he enters shipping address as person
    And he attempts to pay using card
    Then he should be on the payment page