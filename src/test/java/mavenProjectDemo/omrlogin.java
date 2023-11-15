package mavenProjectDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omrlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.omrbranch.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("greens@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Green@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
