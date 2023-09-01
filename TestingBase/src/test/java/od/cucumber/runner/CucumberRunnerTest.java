package od.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/cucumber/LoginPage.feature" }, glue = {
		"od.cucumber.definitions" })
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
