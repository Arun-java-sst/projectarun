package TDDEcommerce;
import java.awt.AWTException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseclass.ArunBaseClass;
import pageclasses.Ecommerce1stPageClass;
import pageclasses.Ecommerce2ndPageClass;
import pageclasses.EcommercePayment;
import pageclasses.Ecommerceaa;

public class HomePage extends ArunBaseClass {	
        @BeforeClass
        public void bfrcls() {
    	openChrome();
        launchUrl("https://www.blossominggifts.com/");
        maxWin();
        ConditionalWait(10);
        }
        
    	@Test
	    public void tc1() throws AWTException, InterruptedException {
		Ecommerceaa e2 = new Ecommerceaa();
		Thread.sleep(9000);
		moveTo(e2.getX());
		pressEnterKey();
		Ecommerce1stPageClass ecp = new Ecommerce1stPageClass();
		press(ecp.getHomelogin());
		tab3Times();
		passTheValues(ecp.getMail(), "arunkumar06mugam@gmail.com");
		passTheValues(ecp.getPassword(), "Test@12345");
		jsClick(ecp.getClick());
		UnconditionalWait(9000);
		tab3Times();
	    }
    	
	    @Test
	    public void tc2() throws InterruptedException, AWTException {
		Ecommerce2ndPageClass ecp1 = new Ecommerce2ndPageClass();
		press(ecp1.getFlowers());
		jsClick(ecp1.getRadiantRose());
	    }
	    
		@Test
		public void tc3() {
		Ecommerce2ndPageClass ecp1 = new Ecommerce2ndPageClass();
		passTheValues(ecp1.getRecepitant(), "Kumar");
		passTheValues(ecp1.getMsg(), "Love~Foreever");
		passTheValues(ecp1.getJipcode(), "SW1A 1AA");
		passTheValues(ecp1.getAddres(), "10 High Street");
		passTheValues(ecp1.getCountry(), "London");
	
		ConditionalWait(2000);
		press(ecp1.getBtnclk());
		press(ecp1.getAnotherClick());
		press(ecp1.getContinu());
		}
		
        @Test
        public void tc4() throws AWTException {
        EcommercePayment ep = new EcommercePayment();
        ConditionalWait(9000);
        switchToFrame(ep.getFrame1());
        passTheValues(ep.getCard(),"4242424242424242");
        switchFromMain();
        switchToFrame(ep.getFrame2());
        passTheValues(ep.getDate(),"1230");
        switchFromMain();
        ConditionalWait(9000);
        tabOnce();
        ConditionalWait(15000);
        pass123();
        press(ep.getSubmit());
        }
        @Test
        public void tc5() {
        ConditionalWait(2000);
        EcommercePayment ep = new EcommercePayment();
        press(ep.getPlaceOrder());
        }
}

	
	
	
		
	