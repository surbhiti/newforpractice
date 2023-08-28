package Testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class HardAssert {
/*@Test
	public void m1()
	{
		System.out.println("step 1");

		System.out.println("step 2");

		System.out.println("step 3");
		Assert.assertEquals(true, false);

		System.out.println("step 4");

		System.out.println("step 5");
		
		
		
	}*/
	@Test
	public void m2()
	{
		String expdata = "surbhi";
		//String actualdata = "Tiwari";
		
		String actualdata = "surbhi";
		Assert.assertEquals(expdata, actualdata);
		
		System.out.println("both are matched");
	}
	
	
	
}
