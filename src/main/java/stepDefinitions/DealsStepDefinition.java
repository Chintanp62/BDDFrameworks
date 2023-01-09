//import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;

//package stepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepDefinition {
//	WebDriver driver;
//	
//
	//		@Given("^user is already on a LoginPage$")
	//		public void user_is_already_on_a_LoginPage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
//				
//				 driver = new ChromeDriver();//Open firefox
//				driver.get("https://ui.freecrm.com/");
//			  
//			}
//			
//			@When("^Title of LoginPage is Cogmento CRM$")
//			public void title_of_LoginPage_is_Cogmento_CRM()  {
//			   String title= driver.getTitle();
//			    System.out.println(title);
//			    Assert.assertEquals("Cogmento CRM", title );
//			   
//			}
//			
//			
//			
//			
//			@Then("^user enters username and password$")
//			public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//				
//				
//			List<List<String>> data = 	credentials.raw();
//			driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//			
//			
//		    
//		}
//			
	//		@Then("^Click on Login button$")
//			public void click_on_Login_button() {
//				driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//			   
//			}
//			@Then("^uSer is on Homepage$")
//			public void user_is_on_Homepage() throws InterruptedException  {
//				String title= driver.getTitle();
//				System.out.println(title);
//				Assert.assertEquals(title, "Cogmento CRM");
//				Thread.sleep(3000);
//				}
//		
//			@Then("^user moves to new deal page$")
//			public void user_moves_to_new_deal_page()  {
//				
			//Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
		
			//driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//		   
//			}
//		
//			@Then("^user entrers deal details$")
//			public void user_entrers_deal_details(DataTable dealdata) throws Throwable {
//				
//				
//				driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
//				
//				List<List<String>> dealValues= dealdata.raw();
//				
//				driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//				driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//				driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//				driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//				
//				
//			    
//			}
//		
//			@Then("^close the browser$")
//			public void close_the_browser()  {
//			    driver.close();
//			}
//
//				
//				}
//			
//			
//			
//			
//		
//		
