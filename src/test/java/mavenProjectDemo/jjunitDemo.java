package mavenProjectDemo;

import org.junit.Assert;
import org.junit.Test;

public class jjunitDemo {
	@Test
	public void test1() {
		System.out.println("Start.........");
		Assert.assertTrue("verify username",true);
		Assert.assertTrue("verify password",false);  // here this place true means 
													// it will execute without error.
		Assert.assertTrue("verify button",true);
		Assert.assertTrue("verify checkbox",true);
		System.out.println("end.........");
	}
	public void test2() {
		System.out.println("test2");
	}
}
