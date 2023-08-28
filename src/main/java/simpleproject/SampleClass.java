package simpleproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {

	public static void main(String[] args) {
	
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// driver.findElement(By.id("username")).sendKeys("admin");
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("admin");
	    //driver.findElement(By.cssSelector("[name=\"pwd\"]")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
	    driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	    driver.findElement(By.cssSelector("a.initial")).click();
	    
	    
		
		
	}

}
