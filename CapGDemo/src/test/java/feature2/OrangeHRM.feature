Feature: Orange HRM login feauture

  Scenario Outline: Orange HRM login Test Scenario
    Given user is already on login page
    When title of login page is OrangeHRM
    Then user enters <username> and <password>
    Then user clicks on login button
    Then user clicks on logout button
    
 Examples:
   |username|password  |
   |aanchal |aanchal123|
   |Admin   |admin123  |