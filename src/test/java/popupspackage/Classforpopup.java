package popupspackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classforpopup {

	public static void main(String[] args) throws Throwable {
		//install google chrome browser
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
//		
//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		pwd.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
	   
         driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]"))
        .click();
         Thread.sleep(1000);
		driver.findElement(By.linkText("Types of Work")).click();
		
		driver.findElement(By.id("ext-gen6")).click();
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("surbhi");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		
		//popup
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
	}

}
