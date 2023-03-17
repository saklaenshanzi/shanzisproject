@withdraw
Feature: Withdraw functionality

  Scenario Outline: to verify the withdraw functionality
    Given I have an account with <init> amount
    When I withdraw <some> amount
    Then I verify the <balance> in my account

    Examples: 
      | init | some | balance |
      |  300 |   50 |     250 |
      | 1000 |  700 |     300 |
