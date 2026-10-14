package propertfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileArun {
public static void main(String[] args) throws IOException {
	//PROPERTIES FILE
	WebDriver driver = new ChromeDriver();
	File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Property File\\EcommerceData.properties");
	FileReader read = new FileReader(f);
	Properties p = new Properties();
	p.load(read);
	String url = p.getProperty("url");
	System.out.println(url);
	driver.get(url);
	driver.manage().window().maximize();
}
}
