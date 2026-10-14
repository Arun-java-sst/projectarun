package TDDEcommerce;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageclasses.Ecommerceaa;
import baseclass.ArunBaseClass;

public class Ecommerse2 extends ArunBaseClass {
	
@BeforeClass
public void bfrcls() {
	openChrome();
    launchUrl("https://www.blossominggifts.com/");
    maxWin();
    ConditionalWait(10);
}

@Test
public void tc1() throws InterruptedException, AWTException{
	Ecommerceaa e2 = new Ecommerceaa();
	Thread.sleep(9000);
	moveTo(e2.getX());
	pressEnterKey();

//	moveTo(e2.getSrc());
//	jsClick(e2.getSrc());
}
}
