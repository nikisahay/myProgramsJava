package testRunner;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions; 
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class) 

@CucumberOptions(features="src/test/java/features",
glue={"stepDefinitions"} , plugin = {"json:target/cucumber.json","pretty",
"html:target/cucumber-reports"}) 
public class Runner extends AbstractTestNGCucumberTests
{
}