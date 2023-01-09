
Feature: Free CRM create contacts 
  I want to use this template for my feature file
  
  

  Scenario Outline: Free CRM create a new contact scenario
   Given user is already on a LoginPage
    When Title of LoginPage is Cogmento CRM
    Then user enters "<username>" and "<password>"
    And Click on Login button
    And uSer is on Homepage
    Then user moves to new contact page
    Then user entrers contacts "<firstname>", "<lastname>" and "<position>"
    Then close the browser

    Examples: 
      | username  | password | firstname  | lastname | position |
      | chintanp365@gmail.com | Delwad@12 | Harry | Potter | Manager |
      | chintanp365@gmail.com | Delwad@12 | Peter | Parker | Lead |  

      
      
     
      