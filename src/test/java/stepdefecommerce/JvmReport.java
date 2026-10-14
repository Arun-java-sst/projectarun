package stepdefecommerce;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String json) {
	//1.Mention the target folder location - File
	File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Jvm reoprt");
	//2.Add details to the report using Configuration class
	Configuration c = new Configuration(f, "BlossomGift Application");
	c.addClassifications("Employee Name", "Arun");
	c.addClassifications("EmployeeId", "123");
	c.addClassifications("Os", "window");
	//3.Add json file paths into List<String>
	List<String> l = new ArrayList<> ();
	l.add(json);
	//4.Create object for ReportBuilder class and using the created object call generateReports() method
	ReportBuilder r = new ReportBuilder(l,c);
	r.generateReports();
	
}
public static void main(String[] args) {
	generateJvmReport("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Report\\Json\\blosom.json");
}

}
