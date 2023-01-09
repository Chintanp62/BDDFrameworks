
Feature: All the test of freeCRM
  I want to use this template for my feature file



 Scenario Outline: Free CRM Login Test Scenario
    
    When Title of LoginPage is Cogmento CRM
    Then user enters "<username>" and "<password>"
    And Click on Login button
    And uSer is on Homepage
    
    
    Examples:
    
    | username | password |
    | chintanp365@gmail.com | Delwad@12 |
    


    Scenario: Free CRM create a new deal scenario
    
   
    
    Then user enters username and password
    | username | password |
    | chintanp365@gmail.com | Delwad@12 |
    
    And aClick on Login button
    And auSer is at Homepage
    Then user moves to new deal page
    Then user entrers deals details
    | title | amount | probability | commission |
    | test deal1 | 1000 | 50 | 10 |
    | test deal2 | 2000 | 60 | 20 |
    | test deal3 | 3000 | 70 | 30 |
    
    
    
    
    
