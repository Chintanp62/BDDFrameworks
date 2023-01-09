//package stepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	
//	@Given("^user is already on a LoginPage$")
//			public void user_is_already_on_a_LoginPage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
//				
//				 driver = new ChromeDriver();//Open firefox
//			driver.get("https://ui.freecrm.com/");
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
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) throws Throwable {
//		driver.findElement(By.name("email")).sendKeys(username);
//		 driver.findElement(By.name("password")).sendKeys(password);
//		
//	}
//	@Then("^Click on Login button$")
//   public void click_on_Login_button() {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//	   
//	}
//	@Then("^uSer is on Homepage$")
//	public void user_is_on_Homepage() throws InterruptedException  {
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Cogmento CRM");
//		Thread.sleep(3000);
//		}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//		
//		driver.close();
//	    
//	}
//
//}
