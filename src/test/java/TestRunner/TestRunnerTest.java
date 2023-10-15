package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Eclipse\\FIS\\Demo1\\src\\main\\resources\\Feature\\Demo.feature",
		glue={"Beb_Stepdefinition"},
		stepNotifications=true,
		dryRun=false,		
		plugin= {"pretty","html:target/cucumber.html"},
		monochrome = true
	
		
		)
public class TestRunnerTest {
	

}


