package mavenProjectDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class jjUnits extends baseClass{
	@org.junit.BeforeClass
	public static void BeforeClass() {
	launchBrowser();
	maximizeWindow();
	enterAppInURL("https://omrbranch.com/");
	}
	@org.junit.AfterClass
	public static void AfterClass() {
		quitBrowser();
		}
	@Test
	public void Login() throws IOException {
		WebElement email = findlocatorsById("email");
		elementSendkeys(email,getCellData("omr", 1, 0));
		WebElement pass = findlocatorsById("pass");
		elementSendkeys(pass,getCellData("omr", 1, 1));
		WebElement btnlogin = findlocatorsByxpath("//button[@value='login']");
		elementClick(btnlogin);
	}
	@After
	public void Aftermethod() throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File f=new File
		("C:\\Users\\vrkav\\eclipse-workspace\\mavenProjectDemo\\src\\test\\java\\screenshot\\After.png");
	FileUtils.copyFile(s,f);
	}
	@Before
	public void Beforemethod() throws IOException {
		long time = System.currentTimeMillis();
		System.out.println(time);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File f=new File
		("C:\\Users\\vrkav\\eclipse-workspace\\mavenProjectDemo\\src\\test\\java\\screenshot\\Before.png");
		FileUtils.copyFile(s,f);
	}
	
	
}
