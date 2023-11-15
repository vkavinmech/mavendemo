package mavenProjectDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class junitsAssertEquals extends baseClass {
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
	public void Login(){
		WebElement w = driver.findElement(By.id("email"));
		w.sendKeys("vrkavinkumar@gmail.com");
		String attribute = w.getAttribute("value");
		System.out.println(attribute);
		Assert.assertEquals("verify username","vrkavinkumar@gmail.com",attribute);
		WebElement w1 = driver.findElement(By.id("pass"));
		w1.sendKeys("Abcd@9894");
		String attribute2 = w1.getAttribute("value");
		System.out.println(attribute2);
		Assert.assertEquals("verify password","Abcd@9894",attribute2);
		WebElement w3 = driver.findElement(By.xpath("//button[.='Login']"));
		w3.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		boolean b = url.contains("https://omrbranch.com/");
		Assert.assertTrue("Verify after login",b);
	}
	@After
	public void Aftermethod() throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File f=new File
		("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\screenshot\\omr.png");
	FileUtils.copyFile(s,f);
	}
	@Before
	public void Beforemethod() throws IOException {
		long time = System.currentTimeMillis();
		System.out.println(time);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File f=new File
		("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\screenshot\\omrr.png");
		FileUtils.copyFile(s,f);
}

}
