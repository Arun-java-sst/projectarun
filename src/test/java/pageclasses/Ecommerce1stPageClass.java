package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class Ecommerce1stPageClass extends ArunBaseClass {

	
	//1 Non parameterized Constructor
		public Ecommerce1stPageClass() {
			PageFactory.initElements(getDriver(), this);
		}
		
	//2 Private WebElements
		
		@FindBy(xpath="//a[@title='Log In']")
		private WebElement homelogin;
		@FindBy(xpath="(//input[@title='Email Address'])[1]")
		private WebElement mail;
		@FindBy(xpath="(//input[@name='password'])[1]")
		private WebElement password;
		@FindBy(xpath="(//button[@class='mainBtn'])[1]")
		private WebElement click;
		
		public WebElement getHomelogin() {
			return homelogin;
		}
		public WebElement getMail() {
			return mail;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getClick() {
			return click;
		}
		
		
	
}
