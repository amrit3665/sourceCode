package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		
		features=".//Feature_Files/Features.feature",
		glue= "stepDefinition",
		
		monochrome=true,
		plugin= {"pretty", "html:target/site/cucumber_repot.html"}
		
		
		)

public class runningTest {

}
