package mavenProjectDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {
		
		static WebDriver driver;
		public static void launchBrowser() {
			driver=new ChromeDriver();
		}
		public static void enterAppInURL(String url) {
			driver.get(url);
		}
		public static void maximizeWindow() {
			driver.manage().window().maximize();
		}
		public static void elementSendkeys(WebElement element,String data) {
			element.sendKeys(data);
		}
		public static void elementClick(WebElement element) {
			element.click();
		}											
		public String getAppInTitle() {
			String title=driver.getTitle();
			return title;
		}
		public static WebElement findlocatorsById(String attributevalue) {
			WebElement Element = driver.findElement(By.id(attributevalue));
			return Element;
		}
		public static WebElement findlocatorsByName(String attributevalue) {
			WebElement Element = driver.findElement(By.name(attributevalue));
			return Element;
		}
		public static WebElement findlocatorsByClassName(String attributevalue) {
			WebElement Element = driver.findElement(By.className(attributevalue));
			return Element;
		}
		public static WebElement findlocatorsByxpath(String xpathexp) {
			WebElement Element = driver.findElement(By.xpath(xpathexp));
			return Element;
		}
		public static void closeBrowser() {
			driver.close();
		}
		public static void quitBrowser() {
			driver.quit();
		}
		public String elementgetText(WebElement element) {
			String text = element.getText();
		return text;
		}
		public String getAppInurl() {
			String currenturl = driver.getCurrentUrl();
		return currenturl;
		}
		public String elementgetAttribute(WebElement element, String attributename) {
			String attribute = element.getAttribute(attributename);
			return attribute;
		}
		public static void elementClear(WebElement element) {
			element.clear();
		}
		
		public void AcceptAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public void CancelAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		public void selectBytext(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByVisibleText(value);
		}
		public void selectByAttribute(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByValue(value);
		}
		public void selectByindex(WebElement element,int value) {
			Select s=new Select(element);
			s.selectByIndex(value);
		}
		public void Switchchildwindow(String id) {
			driver.switchTo().window(id);
		}
		public void FramebyIndex(String id) {
			driver.switchTo().frame(id);
		}
		public void FramebyframeId(String value) {
			driver.switchTo().frame(value);
		}
		public String selectAlloptions(WebElement element) {
			Select s=new Select(element);
			String text = s.getWrappedElement().getText();
			return text;
		}
		public String selectAttribute(WebElement element, String value) {
			Select s=new Select(element);
			String attribute = s.getWrappedElement().getAttribute(value);
			return attribute;	
		}
		public String getFirstSelectedOptionText(WebElement element) {
			Select s=new Select(element);
			String text = s.getFirstSelectedOption().getText();
			return text;
		}
		public void MultiselectOption(WebElement element,int value,String value1) {
			Select s=new Select(element);
			s.selectByIndex(value);
			s.selectByValue(value1);
		}
		public static void ImplicitlyWait() {					//doubt
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		public static void explicitlyWait(WebElement element) {		// doubt
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void fluentWait(int value,int value1,int value2) {	// doubt
			FluentWait<WebDriver>f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(value)).
					pollingEvery(Duration.ofSeconds(value1, value2)).ignoring(Exception.class);
			f.until(ExpectedConditions.alertIsPresent());			
		}
		public boolean IsDisabled(WebElement element) {
			boolean display = element.isDisplayed();
			return display;
		}
		public boolean IsEnabled(WebElement element) {
			boolean enable = element.isEnabled();
			return enable;
		}
		public boolean IsSelected(WebElement element) {
			boolean selected = element.isSelected();
			return selected;
		}
		public void DeselectBytext(WebElement element,String value) {
			Select s=new Select(element);
			s.deselectByVisibleText(value);
		}
		public void DeselectByAttribute(WebElement element,String value) {
			Select s=new Select(element);
			s.deselectByValue(value);
		}
		public void DeselectByindex(WebElement element,int value) {
			Select s=new Select(element);
			s.deselectByIndex(value);
		}
		public String getParentWindow() {
			String w = driver.getWindowHandle();
			//driver.switchTo().window(id);
			return w;
		}
		public Set<String> getAllWindow() {
			Set<String> s = driver.getWindowHandles();
			return s;
		}
		public void MousehoverSingleElement(WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		public void RightClick(WebElement element) {
			Actions a=new Actions(driver);
			a.contextClick(element).perform();
		}
		public void DoubleClick(WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
		}
		public void DragandDrop(WebElement element,WebElement element1) {
			Actions a=new Actions(driver);
			a.dragAndDrop(element, element1).perform();;
		}
		public void InservalueInTextbox(WebElement element,String value) throws AWTException {
			element.sendKeys(value);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public void RefreshPage() {
			driver.navigate().refresh();
		}
		public static void TakeScreenShot(String name) throws IOException {
			TakesScreenshot t=(TakesScreenshot)driver;
			File f = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f,new File
			("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\screenshot"+name+".png"));
		}
		public static void TakeScreenShotForElement(WebElement element, String name) throws IOException {
			File f = element.getScreenshotAs(OutputType.FILE);
				}
		public static void SendkeysbyJs(WebElement element,String data) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
		}
		public static String getCellData(String sheetname,int rownum,int cellnum) throws IOException {
			String res="";
			File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenProjectDemo\\src\\test\\java\\Excel\\testdata.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType type = cell.getCellType();
		switch(type) {
		case STRING:
			res=cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				java.util.Date dc =cell.getDateCellValue();
				SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yy");
			}
			else {
				double n = cell.getNumericCellValue();
				long check = Math.round(n);
				if(check==n) {
					res=String.valueOf(check);
				}
				else {
					res=String.valueOf(n);
				}
			}
			break;
				default:
					break;	
			}
			return res;
		}
		public static void updateCellData(String sheetname,int rownum,int cellnum,String olddata,String newdata) throws IOException {
			File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenProjectDemo\\src\\test\\java\\Excel\\testdata.xlsx");
			FileInputStream fileInputStream  = new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			String value = cell.getStringCellValue();
			if(value.equals(olddata)) {
				cell.setCellValue(newdata);
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		}
		public static void createCellandSetcellData(String sheetname,int rownum,int cellnum,String data) throws IOException {
			File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\Excelsheet\\testdata.xlsx");
			FileInputStream fileInputStream  = new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);	
			}
}
