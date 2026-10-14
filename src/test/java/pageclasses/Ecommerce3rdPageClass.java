package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class Ecommerce3rdPageClass extends ArunBaseClass {
	//1 Non parameterized Constructor
	public Ecommerce3rdPageClass() {
		PageFactory.initElements(getDriver(), this);
	}
	
//2 Private WebElements
	@FindBy(xpath="//input[@id='options_1989991_text']")
	private WebElement recepitentName;
}
