package mavenProjectDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class omrExtendsBaseclass extends baseClass{

	public static void main(String[] args) throws IOException {	
		launchBrowser();
		enterAppInURL("https://omrbranch.com/");
		maximizeWindow();
		ImplicitlyWait();
		WebElement emailid = findlocatorsById("email");
		elementSendkeys(emailid, getCellData("omr", 1, 0));
		WebElement password = findlocatorsById("pass");
		elementSendkeys(password,getCellData("omr", 1, 1));
		WebElement login = findlocatorsByxpath("//button[.='Login']");
		elementClick(login);
		String welcome = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']")).getText();
		System.out.println(welcome);
		closeBrowser();
	}
}
