Feature: Shopping Update

  Scenario: All shopping done
    Given I am out shopping And I have eggs
    And I have milk
    And I have butter
    When I check my shopping list
    Then I should not have anything left
