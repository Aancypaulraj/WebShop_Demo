package stepDefinition1;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="C:\\Users\\aancy.p\\Downloads\\Project1\\CucumberProject\\src\\test\\resources\\Features\\GiftCard.feature"	, 
	glue= {"stepDefinition1"},
	dryRun=false,		
	plugin= {"pretty","html:target/Reports/GiftCard.html"},
	monochrome = true
		)

public class TestRunner {

	
}
