package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class Ecommerceaa extends ArunBaseClass{

	//1 Non parameterized Constructor
		public Ecommerceaa() {
			PageFactory.initElements(getDriver(), this);
		}
		
	//2 Private WebElements
		
		@FindBy(xpath="//a[text()='Log In'][@title='Log In']")
		private WebElement login;
		
		@FindBy(xpath="(//input[@id='search'][@class='input-text'][@type='text'][@placeholder='Search...'][@name='q'])[2])")
		private WebElement src;

		@FindBy(xpath="//*[@stroke='rgba(255,255,255,1)']")
		private WebElement x;
		
		@FindBy(xpath="//div[@id='menu616']")
		private WebElement xmas;

		public WebElement getLogin() {
			return login;
		}

		public WebElement getSrc() {
			return src;
		}

		public WebElement getX() {
			return x;
		}

		public WebElement getXmas() {
			return xmas;
		}
		

	
		
}
