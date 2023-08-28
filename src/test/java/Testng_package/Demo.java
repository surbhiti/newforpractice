package Testng_package;

import org.testng.annotations.Test;


public class Demo {


		
		@Test(priority=1)
		public void createContact()
		{
			System.out.println("contact created");
		}
		
		@Test(priority=2)
		public void modifycontact()
		{
			
		System.out.println("contact modify");
		}
		
		@Test(priority=3)
		public void deletecontact()
		
		{
		System.out.println("contact deleted");
		}
		
	}