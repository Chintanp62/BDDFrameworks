

Feature: Free CRM Login Feature
  I want to use this template for my feature file



 Scenario Outline: Free CRM Login Test Scenario
    Given user is already on a LoginPage
    When Title of LoginPage is Cogmento CRM
    Then user enters "<username>" and "<password>"
    And Click on Login button
    And uSer is on Homepage
    Then close the browser
    
    Examples:
    
    | username | password |
    | chintanp365@gmail.com | Delwad@12 |

  