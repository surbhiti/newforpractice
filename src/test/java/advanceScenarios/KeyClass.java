package advanceScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyClass {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//case:1
		/*driver.findElement(By.id("username")).sendKeys("admin");
		 WebElement pwd = driver.findElement(By.name("pwd"));
		 pwd.sendKeys("manager");
		 pwd.sendKeys(Keys.ENTER);*/
		
		//case:2
		
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);*/
		
		//case:3
		
		
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	}

}
