package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\src\\test\\resources\\Featurefile\\purchaseproduct.feature",
glue = "stepdefecommerce",
monochrome = true,
dryRun = false,
//tags = "not @login2",
plugin = {
		"html:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Html\\blosom.html",
		"junit:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Junit\\blosom.xml",
		"json:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Json\\blosom.json",
		"rerun:C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Rerun\\rerunnn1.text"
}
)
public class EcommerceRunnerClass extends AbstractTestNGCucumberTests  {
//	@AfterClass
//	public void after() {
//		JvmReport.generateJvmReport("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Jvm reoprt\\blosom.json");
//	}
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	} 
}
