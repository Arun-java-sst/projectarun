package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class EcommerceHampers extends ArunBaseClass{
	//1 Non parameterized Constructor
		public EcommerceHampers() {
			PageFactory.initElements(getDriver(), this);
		}
		
	//2 Private WebElements
		@FindBy(xpath="//div[@id='menu545']")
		private WebElement hampers;
		@FindBy(xpath="(//button[@class='btn dropdown-toggle btn-default'][@type='button'])[1]")
		private WebElement show;
		
        @FindBy(xpath="(//a[@title='Next'][@class='next i-next'])[2]")
        private WebElement next;

		public WebElement getNext() {
			return next;
		}
		public WebElement getHampers() {
			return hampers;
		}
		public WebElement getShow() {
			return show;
		}
	}


