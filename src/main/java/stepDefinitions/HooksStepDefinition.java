package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
WebDriver driver;
	

@Before
public void setUp()
{System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");

driver = new ChromeDriver();//Open firefox
driver.get("https://ui.freecrm.com/");
	
}
	@After
	public void tearDwon() {
		driver.close();
	}
			
			@When("^Title of LoginPage is Cogmento CRM$")
			public void title_of_LoginPage_is_Cogmento_CRM()  {
			   String title= driver.getTitle();
			    System.out.println(title);
			    Assert.assertEquals("Cogmento CRM", title );
			   
			}
	
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		
	}
	@Then("^Click on Login button$")
   public void click_on_Login_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	   
	}
	@Then("^uSer is on Homepage$")
	public void user_is_on_Homepage() throws InterruptedException  {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
		Thread.sleep(3000);
		}

	

	

	

	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials) throws Throwable {
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			 
			 
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));		}
	 }

	 @Then("^aClick on Login button$")
	 public void aclick_on_Login_button() throws Throwable {
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 
	 }

	 @Then("^auSer is at Homepage$")
	 public void auser_is_at_Homepage() throws Throwable {
		 String title= driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Cogmento CRM");
			Thread.sleep(3000);
	 }

	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() throws Throwable {
		 
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
		
			driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	 }

	 @Then("^user entrers deals details$")
	 public void user_entrers_deals_details(DataTable dealData) throws Throwable {
		 for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
			 
			 
			 driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
			
				 			driver.findElement(By.name("title")).sendKeys(data.get("title"));
				 			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
				 			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
				 			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
				 			
			 			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click(); //save button
			 			
				 			//move to new deal page:
			 			Actions action = new Actions(driver);
			 			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
			 			Thread.sleep(3000);
			 				driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
				 			Thread.sleep(3000);
		 }
	 }

	


}
