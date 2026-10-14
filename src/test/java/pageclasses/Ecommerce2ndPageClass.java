package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.ArunBaseClass;

public class Ecommerce2ndPageClass extends ArunBaseClass{
	//1 Non parameterized Constructor
			public Ecommerce2ndPageClass() {
				PageFactory.initElements(getDriver(), this);
			}
			
		//2 Private WebElements
			@FindBy(xpath="(//span[text()='Flowers'])[2]")
			private WebElement Flowers;
			
			public WebElement getFlowers() {
				return Flowers;
			}

			@FindBy(xpath="//a[text()='Radiant Glow']")
			private WebElement radiantRose;
			
			@FindBy(xpath="//input[@id='options_1989991_text']")
			private WebElement recepitant;
			
			public WebElement getRecepitant() {
				return recepitant;
			}
            @FindBy(xpath="//textarea[@id='options_1989992_text']")
            private WebElement msg;
			public WebElement getMsg() {
				return msg;
			}
            
			@FindBy(xpath="//a[text()='Blue Roses ']")
			private WebElement blueRoses;
			@FindBy(xpath="//input[@id='options_2164854_text']")
			private WebElement kumar;
			@FindBy(xpath="//textarea[@id='options_2164855_text']")
			private WebElement lovemsg;
			@FindBy(xpath="//input[@id='postcode_id']")
			private WebElement jipcode;

			@FindBy(xpath="//input[@id='street1_id']")
			private WebElement addres;
			@FindBy(xpath="//input[@id='town_id']")
			private WebElement country;
			@FindBy(xpath="//button[@class='addBtn prmBtn btn-dark']")
			private WebElement btnclk;
			@FindBy(xpath="(//button[@class='btn-dark btn-proceed-checkout'])[2]")
			private WebElement anotherClick;
			public WebElement getBlueRoses() {
				return blueRoses;
			}
			public WebElement getRadiantRose() {
				return radiantRose;
			}
			public WebElement getKumar() {
				return kumar;
			}
			public WebElement getLovemsg() {
				return lovemsg;
			}
			public WebElement getJipcode() {
				return jipcode;
			}
			public WebElement getAddres() {
				return addres;
			}
			public WebElement getCountry() {
				return country;
			}
			public WebElement getBtnclk() {
				return btnclk;
			}
			public WebElement getAnotherClick() {
				return anotherClick;
			}
		@FindBy(xpath="(//button[@class='btn-dark'])[3]")
		private WebElement viewbag;

		public WebElement getViewbag() {
			return viewbag;
		}
			
		@FindBy(xpath="//button[@title='Continue' and @type='button']")
		private WebElement continu;

		public WebElement getContinu() {
			return continu;
		}
		
}
