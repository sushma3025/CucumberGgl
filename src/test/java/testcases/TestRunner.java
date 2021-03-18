package testcases;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features/example.feature",glue={"stepDefinition"}, monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
