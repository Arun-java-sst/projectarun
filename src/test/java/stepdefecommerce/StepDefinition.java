package stepdefecommerce;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseclass.ArunBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Ecommerce1stPageClass;
import pageclasses.Ecommerce2ndPageClass;
import pageclasses.EcommerceHampers;
import pageclasses.EcommercePayment;
import pageclasses.Ecommerceaa;

public class StepDefinition extends ArunBaseClass{

@Given("Maximize, handle synchronization and clear popup")
public void maximize_handle_synchronization_and_clear_popup() throws AWTException, InterruptedException {
	  maxWin();
      ConditionalWait(10);
      Ecommerceaa e2 = new Ecommerceaa();
      UnconditionalWait(9000);
	  moveTo(e2.getX());
	  pressEnterKey();
	//ASSERT NO.1
	  String title = getTheTitle();
		System.out.println(title);
		Assert.assertEquals("Flowers Delivered | Flower Delivery | Blossoming Gifts", title,"Page Title is Not Same becoz actual vs expected not same");
	System.out.println("1st Assert passed");
	 Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
		press(ecp.getHomelogin());
		tab3Times();
	
}
@When("User Have to pass the {string} and {string} and click login")
public void user_have_to_pass_the_and_and_click_login(String string, String string2) throws InterruptedException, AWTException {
	Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
	passTheValues(ecp.getMail(), string);
	passTheValues(ecp.getPassword(), string2);
	WebElement search = ecp.getClick();
	boolean displayed = isDisplayed(search);
	
	//ASSERT NO.2
	Assert.assertTrue(displayed, "Click Btton is not Availabled");
	System.out.println("Button is clickable and 2nd Assert passed");
	jsClick(ecp.getClick());
	UnconditionalWait(9000);
	tab3Times();

}
@When("User Have to select gift")
public void user_have_to_select_gift() {
	Ecommerce2ndPageClass ecp1 = new Ecommerce2ndPageClass();
	press(ecp1.getFlowers());
	
	//ASSERT NO.3
	  String cuUrl = getTheCurrentUrl();
		System.out.println(cuUrl);
		Assert.assertEquals("https://www.blossominggifts.com/flowers", cuUrl,"Page url is Not Same becoz actual vs expected not same");
	System.out.println("Checking selectGift url 3rd Assert passed");
	jsClick(ecp1.getRadiantRose());
}
@When("User Have to fill the gift message")
public void user_have_to_fill_the_gift_message(io.cucumber.datatable.DataTable dataTable) {
	Ecommerce2ndPageClass ecp1 = new Ecommerce2ndPageClass();
	List<String> list1 = dataTable.asList();
	passTheValues(ecp1.getRecepitant(), list1.get(0));
	passTheValues(ecp1.getMsg(),list1.get(1));
	
}
@When("User Have to fill the delivery address details")
public void user_have_to_fill_the_delivery_address_details() throws IOException {
	Ecommerce2ndPageClass ecp1 = new Ecommerce2ndPageClass();
	passTheValues(ecp1.getAddres(), readFilegetdata("Blosom.xlsx", "Sheet1", 0,0));
	passTheValues(ecp1.getCountry(), readFilegetdata("Blosom.xlsx", "Sheet1", 1,0));
	passTheValues(ecp1.getJipcode(), readFilegetdata("Blosom.xlsx", "Sheet1", 2,0));
	ConditionalWait(2000);
	jsClick(ecp1.getBtnclk());
	press(ecp1.getAnotherClick());
	WebElement cont = ecp1.getContinu();
	boolean enableToClick = isEnabled(cont);
	
	//ASSERT NO.4
	Assert.assertTrue(enableToClick, "Click Btton is not Availabled");
	System.out.println("Button is enable to click and 4th Assert passed");
	press(ecp1.getContinu());
}
@When("User Have to doing payment")
public void user_have_to_doing_payment(io.cucumber.datatable.DataTable data) throws AWTException {
	 Map<String, String> map1 = data.asMap();
	  	 EcommercePayment ep = new EcommercePayment();
	        ConditionalWait(8000);
	        switchToFrame(ep.getFrame1());
	        WebElement card = ep.getCard();
	    	boolean cardnumavailable = isDisplayed(card);
	    	//ASSERT NO.5
	    	Assert.assertTrue(cardnumavailable, "Impossible to pass card number");
	    	System.out.println("Possible to pass Card Number and 5th Assert passed");
	        passTheValues(ep.getCard(),map1.get("cardnum"));
	        switchFromMain();
	        switchToFrame(ep.getFrame2());
	        passTheValues(ep.getDate(),map1.get("expdt"));
	        switchFromMain();
	        ConditionalWait(8000);
	        tabOnce();
	        ConditionalWait(9000);
	        pass123();
	        press(ep.getSubmit());
}
@Then("User Have place order")
public void user_have_place_order() {
   EcommercePayment ep =new  EcommercePayment();
   //ASSERT NO.7
   boolean place = isEnabled(ep.getPlaceOrder());
   Assert.assertTrue(place, "place order is enable to click"); 
   System.out.println("place order is enable to click and 7th Assert passed");
   press(ep.getLogout());
}


//VALIDATE HAMPER 
@When("User Have to click hamper option")
public void user_have_to_click_hamper_option() {
	 EcommerceHampers eh = new EcommerceHampers();
	    press(eh.getHampers());
	    boolean showw= isDisplayed(eh.getShow());
	    SoftAssert s = new SoftAssert();
		  //ASSERT NO.8 -Soft Assert
			s.assertEquals(true, showw, "show button is not available");
		    s.assertAll();
		    System.out.println("Show Button is available to click 8th Assert(Soft Assert) passed");
	  //  press(eh.getNext()); 
	  
}

//VALIDATE LOGIN WITH POSSIBILITIES
@When("User Have to pass the valid {string} and valid {string} and click login")
public void user_have_to_pass_the_valid_and_valid_and_click_login(String string, String string2, io.cucumber.datatable.DataTable l1)  {
   
    List<String> list1 = l1.asList();
    Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
	passTheValues(ecp.getMail(), list1.get(0));
	passTheValues(ecp.getPassword(), list1.get(1));
	press(ecp.getClick());  
}
@When("User Have to pass the invalid {string} and invalid {string} and click login")
public void user_have_to_pass_the_invalid_and_invalid_and_click_login(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    List<Map<String,String>> maps = dataTable.asMaps();
    Map<String, String> map = maps.get(1);
	 Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
		passTheValues(ecp.getMail(), map.get("gmail"));
		passTheValues(ecp.getPassword(), map.get("password"));
		press(ecp.getClick());
}
@When("User Have to pass the invalid {string} and valid {string} and click login")
public void user_have_to_pass_the_invalid_and_valid_and_click_login(String string, String string2, io.cucumber.datatable.DataTable dl1)  {
    List<List<String>> lists = dl1.asLists();
    List<String> list = lists.get(1);
    Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
   	passTheValues(ecp.getMail(), list.get(0));
   	passTheValues(ecp.getPassword(), list.get(1));
   	press(ecp.getClick());
}
@When("User Have to pass the valid {string} and invalid {string} and click login")
public void user_have_to_pass_the_valid_and_invalid_and_click_login(String string, String string2, io.cucumber.datatable.DataTable d1) {
    Map<String, String> map1 = d1.asMap();
    Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
   	passTheValues(ecp.getMail(), map1.get("gmail"));
   	passTheValues(ecp.getPassword(), map1.get("password"));
   	ConditionalWait(2000);
   	press(ecp.getClick());
}

}
