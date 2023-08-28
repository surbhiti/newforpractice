package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class3 {
	@Test
	public void FC()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
	}

}
