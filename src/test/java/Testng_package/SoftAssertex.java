package Testng_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertex 
{
	
@Test
	public void m1()
	
  {
		System.out.println("step 1");

		System.out.println("step 2");

		System.out.println("step 3");
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(true, false);

		System.out.println("step 4");

		System.out.println("step 5");
		
		soft.assertAll();
		
	}
	
	
	
}
