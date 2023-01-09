package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\rinku\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\features\\hooks.feature"},
		glue={"stepDefinitions"},
		plugin= {"pretty", "html: test-output", "junit: junit.xml/cucumber.xml"},
		monochrome= true,
		strict= true,
		dryRun= false
	   //tags= {"~@SmokeTest", "@RegressionTest"}
		)

public class TestRunner {
	
	
	
	

}
