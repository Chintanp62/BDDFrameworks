
Feature: Deal data creation

 Scenario: Free CRM create a new deal scenario
   Given user is already on a LoginPage
    When Title of LoginPage is Cogmento CRM
    Then user enters username and password
    | chintanp365@gmail.com | Delwad@12 |
    
    And Click on Login button
    And uSer is on Homepage
    Then user moves to new deal page
    Then user entrers deal details
    | test deal | 1000 | 50 | 20 |
    Then close the browser
    
   # action.moveToElement(driver.findElement(By.xpath("//a[(text()='"+name+"')]/parent::td//preceding-sibling::td//input[@name='id']"))).click().perform();
	#//action.moveToElement use when element is not able to clicled..

 
