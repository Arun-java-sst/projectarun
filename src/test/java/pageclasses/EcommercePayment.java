package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class EcommercePayment extends ArunBaseClass {

	//1 Non parameterized Constructor
		public EcommercePayment() {
			PageFactory.initElements(getDriver(), this);
		}
		
	//2 Private WebElements
		
		@FindBy(xpath="//iframe[@id='bluesnap-hosted-iframe-ccn']")
		private WebElement frame1;
		
		@FindBy(xpath="//input[@id='ccn']")
		private WebElement card;
		
		
		@FindBy(xpath="//iframe[@id='bluesnap-hosted-iframe-exp']")
		private WebElement frame2;
		
		@FindBy(xpath="//input[@id='exp']")
		private WebElement date;
		
		@FindBy(xpath="//button[@onclick='submitPaymentMethod();']")
		private WebElement submit;
		
		@FindBy(xpath="//button[@title='Place Order']")
		private WebElement placeOrder;

		@FindBy(xpath="//a[text()='Log Out']")
		private WebElement logout;
		
		public WebElement getLogout() {
			return logout;
		}

		public WebElement getFrame1() {
			return frame1;
		}

		public WebElement getCard() {
			return card;
		}

		public WebElement getFrame2() {
			return frame2;
		}

		public WebElement getDate() {
			return date;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getPlaceOrder() {
			return placeOrder;
		}
		
		
		
		
		
}
