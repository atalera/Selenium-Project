Feature: Free CRM login feauture

  Scenario: Free CRM login Test Scenario
    Given user is already on login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
