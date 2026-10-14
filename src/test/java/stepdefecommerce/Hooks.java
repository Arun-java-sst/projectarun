package stepdefecommerce;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.ArunBaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends ArunBaseClass {

	@Before(order = 10)
	public void openBrowser() {
		openChrome();
	}
	@Before(order = 20)
	public void launch() throws IOException {
		launchUrl(getDataFromPropertFile("url"));
	}
	
	
	@After
	
		// to get the screenshot for failed scenario and attach the jvm report 
		
		public void teardown(Scenario s) {
			if(s.isFailed()) {
				TakesScreenshot tk = (TakesScreenshot)getDriver();
				byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
				s.attach(sc, "image/png", s.getName());
				System.out.println("attached screenshot");
			}
		quitBrowser();
	}
	}

