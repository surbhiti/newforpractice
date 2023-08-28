package Testng_package;

import org.testng.annotations.Test;

public class invocationcount {
	
	@Test
	public void createContact()
	{
		
		System.out.println("contact created");
		
	}
	
	@Test(invocationCount=3)
	public void modifycontact()
	{
		
	System.out.println("contact modify");
	}
	
	@Test()
	public void deletecontact()
	
	{
	System.out.println("contact deleted");
	}
	
	

}


