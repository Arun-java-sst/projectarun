package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Rerun\\rerunnn1.text",
glue= "stepdefecommerce",
monochrome = true,
dryRun = false,
//tags = "@login1 and @regression or @smoke",
plugin = {"pretty",
		"html:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Html\\blosom.html",
		"junit:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Junit\\blosom.xml",
		"json:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Json\\blosom.json",
		"rerun:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Rerun\\rerunnn1.text"})
public class Reruun  extends AbstractTestNGCucumberTests{

}
