@deposit
Feature: Deposit functionality

  Scenario Outline: to verify the deposit functionality
    Given I have an account with <init> amount.
    When I deposit <some> amount
    Then I verify the <balance> in my account

    Examples: 
      | init | some | balance |
      |  300 |   50 |     350 |
      | 1000 |  700 |    1700 |
