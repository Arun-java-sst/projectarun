package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ArunBaseClass {
	public static Alert aa;
	public static Robot r;
	public static Actions a;
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	public static JavascriptExecutor js;
	//WEB DRIVER METHODS
	
	public static WebDriver getDriver() {
		return tlDriver.get();
		}
	public static void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}
	public static void openChrome() {
		ChromeDriver chDriver = new ChromeDriver();
		setDriver(chDriver);
	}
	public static void openEdge() {
		EdgeDriver edDriver = new EdgeDriver();
		setDriver(edDriver);
	}
	public static void openFirefox() {
		FirefoxDriver ffDriver = new FirefoxDriver();
		setDriver(ffDriver);
	}
	public static void launchUrl(String Url) {
		getDriver().get(Url);
	}
	public static void maxWin() {
		getDriver().manage().window().maximize();
	}
	public static String getTheTitle() {
		return getDriver().getTitle();
	}
	public static String getTheCurrentUrl() {
		return getDriver().getCurrentUrl();
		
	}
	public static void closeTab() {
		getDriver().close();
	}
	public  static void quitBrowser() {
		if(getDriver() !=null) {
		getDriver().quit();
		tlDriver.remove();
		}
	}
	//WEB ELEMENT METHODS
	public static void passTheValues(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	public static void press(WebElement ref) {
		ref.click();
	}
	public static String getTheText(WebElement ref) {
		return ref.getText();
	}
	public static String getTheAttribute(WebElement ref, String value) {
		return ref.getAttribute(value);
	}
	
	//ACTIONS CLASS METHODS
	public static void moveTo(WebElement ref) {
	    a = new Actions(getDriver());
		a.moveToElement(ref).perform();	
	}
	public static void rightclick(WebElement ref) {
		a.contextClick(ref).perform();
	}
	public static void doubleTimeClick(WebElement ref) {
		a.doubleClick(ref).perform();
	}
	public static void dragAndDrop(WebElement source, WebElement target) {
		a.dragAndDrop(source, target).perform();
	}
	
	//ROBOT CLASS METHODS
	public static void pressAnyKey(int keycode) {
		r.keyPress(keycode);
	}
	public static void releaseAnyKey(int keycode) {
		r.keyRelease(keycode);
	}
	public static void pressEnterKey() throws AWTException {
	    r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void paste()  {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	public static void copy()  {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static void tabOnce () throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);	
	}
	public static void pass123 () throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
	}
	public static void tab3Times() throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void tab7times() throws InterruptedException, AWTException {
		Robot r = new Robot();
	for (int i = 0; i <= 7; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	Thread.sleep(9000);
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_O);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_E);
	
	Thread.sleep(9000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
    //ALERT METHODS
	public static void acceptAlert() {
		aa = getDriver().switchTo().alert();
		aa.accept();
	}
	public static void passValuesInAlert(String value) {
		aa = getDriver().switchTo().alert();
		aa.sendKeys(value);
	}
	public static String getAlertText() {
		aa = getDriver().switchTo().alert();
		return aa.getText();
	}
	public static void dismissAlert() {
		aa.dismiss();
	}
	
	//FRAME METHODS
	public static void switchToFrame(WebElement ref) {
		getDriver().switchTo().frame(ref);
	}
	public static void switchFromFrame() {
		getDriver().switchTo().parentFrame();
	}
	public static void switchFromMain() {
		getDriver().switchTo().defaultContent();
	}
	
	//WINDOWS HANDLING
	public static void getWindowParentId() {
		getDriver().getWindowHandle();
	}
	public static void getWindowAllId(int index) {
		Set<String> windowHandles = getDriver().getWindowHandles();
		//System.out.println(windowHandles);
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		String ref = li.get(index);
		getDriver().switchTo().window(ref);
	}
	public static void switchToWindow(String Id) {
		getDriver().switchTo().window(Id);
	}
	//TAKE SCREENSHOT
	public static void takeScreenshot(String filename)  throws Exception {
		TakesScreenshot t = (TakesScreenshot) getDriver();
		File src = t.getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\lenovo\\newfolder\\"+filename+".png");
	    FileUtils.copyFile(src, des);
	}
	//JAVASCRIPT EXECUTOR
	public static void jsSendKeys(WebElement ref,String value) {
		js = (JavascriptExecutor)getDriver();
	//	 js.executeScript("arguments[0].value = arguments[1];", element, value);
		js.executeScript("arguments[0].setAttribute('value',arguments[1])",ref,value);
	}
	public static String jsGetAttribute(WebElement ref) {
	    Object val = js.executeScript("return arguments[0].value", ref);
		return String.valueOf(val);
	}
	public static void jsClick(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
              js.executeScript("arguments[0].click()", ref);
		
	}
	public static void jsScrollView(WebElement ref) {
		js.executeScript("arguments[0].scrollIntoView(true)",ref);
	}
	
	//WAIT
	public static void UnconditionalWait(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	public static void ConditionalWait(int seconds) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public static void WebWait(WebElement ref) {
		 WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(ref));
	}
	
	//VISIBILITY CHECK METHODS
	public static boolean isDisplayed(WebElement ref) {
		return ref.isDisplayed();
	}
	public static boolean isSelected(WebElement ref) {
		return ref.isSelected();
	}
	public static boolean isEnabled(WebElement ref) {
		return ref.isEnabled();
	}
	public static void selectByVisibleText(WebElement ref, String text) {
		Select st = new Select(ref);
		st.selectByVisibleText(text);
	}

	//DATA DRIVEN ---- READ DATA
		public static String readFilegetdata(String excelName, String sheetName, int rowNo, int cellNo) throws IOException  {
			//1. Select the File
			File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\AdactinExcel\\"+excelName);
			//2. Read the File
			FileInputStream fin = new FileInputStream(f);			
			//3. Accessing the File
			Workbook book = new XSSFWorkbook(fin);			
			//4. get a sheet
			Sheet sht = book.getSheet(sheetName)					;
		    //5. get a row 
		    Row r = sht.getRow(rowNo);			 
			//6.get a cell
			Cell cell = r.getCell(cellNo);
			String s;
			if (cell.getCellType()==1) {
			      s = cell.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				 s = simple.format(d);
			//System.out.println(s);
			}
			else {
				double doub = cell.getNumericCellValue();
				long l = (long) doub;
				 s = String.valueOf(l);	
			//	 System.out.println(s);
			}
		return s;	
	}

    // WRITE DATA
	public static void writeData(String excelName, String sheetName, String[][] data) throws IOException {
    File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\SeleniumFramework\\Workbook\\"+ excelName);
	Workbook book = new XSSFWorkbook();	
	Sheet sh = book.createSheet(sheetName);	
	//Create Rows
	for (int i = 0; i < data.length; i++) {
	Row r = sh.createRow(i);
	    //Create Cells
	    for (int  j= 0; j < data[i].length; j++) {
	    Cell c = r.createCell(j);	
	    c.setCellValue(data[i][j]);
	    }
	}
	FileOutputStream fo = new FileOutputStream(f);
	book.write(fo);
	}	
	
	//MODIFY DATA
	public static void modifyData(String excelName, String sheetName, int rownum, int cellNo, String value) throws IOException {
		//1. Select the File
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\SeleniumFramework\\Workbook\\"+excelName);		
		//2. Read the File
		FileInputStream fin = new FileInputStream(f);		
		//3. Accessing the File
		Workbook book = new XSSFWorkbook(fin);		
		//4. Get a sheet & create row & cell
		Sheet sht = book.getSheet(sheetName);
		Row r = sht.getRow(rownum);
		Cell c = r.getCell(cellNo);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
}

	
	public static String getDataFromPropertFile (String key) throws IOException {

	File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\projectarun\\Property File\\EcommerceData.properties");
	FileReader read = new FileReader(f);
	Properties p = new Properties();
	p.load(read);
	return p.getProperty(key);
	
	}
}

