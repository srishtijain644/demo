package Runner;




import cucumber.api.CucumberOptions;


import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= "src/test/java/Feature",
		glue= "StepDefinition",
		tags = {"@Feature1"}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
