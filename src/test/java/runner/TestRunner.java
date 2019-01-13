package runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue={"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber"}
		)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
