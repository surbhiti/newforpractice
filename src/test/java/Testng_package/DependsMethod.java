package Testng_package;

import org.testng.annotations.Test;

public class DependsMethod {

 @Test(priority=1)
		public void createContact()
		{
			
			System.out.println("contact created");
			//int[] ar= {1,2,3};
			//System.out.println(ar[5]);
		}
		
		@Test(dependsOnMethods="createContact")
		public void modifycontact()
		{
			
		System.out.println("contact modify");
		}
		
		@Test(dependsOnMethods="createContact")
		public void deletecontact()
		
		{
		System.out.println("contact deleted");
		}
		
	}

