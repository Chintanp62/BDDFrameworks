
Feature: Deal data creation

    Scenario: Free CRM create a new deal scenario
    
   Given user is already on a LoginPage
    When Title of LoginPage is Cogmento CRM
    Then user enters username and password
    | username | password |
    | chintanp365@gmail.com | Delwad@12 |
    
    And Click on Login button
    And uSer is on Homepage
    Then user moves to new deal page
    Then user entrers deals details
    | title | amount | probability | commission |
    | test deal1 | 1000 | 50 | 10 |
    | test deal2 | 2000 | 60 | 20 |
    | test deal3 | 3000 | 70 | 30 |
    Then closes the browser

 
