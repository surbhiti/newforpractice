package dropdownscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownbykeysclass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Day.click();
		Day.sendKeys(Keys.ARROW_UP);
		Day.sendKeys(Keys.ARROW_UP);
		Day.sendKeys(Keys.ARROW_UP);
		//selectByindex
		//Select sel=new Select(day);
		//sel.selectByIndex(8);
		
		
		
		//selectByValue()
		/*Select sel1=new Select(Day);
		sel1.selectByValue("10");
		
		
		WebElement Month = driver.findElement(By.id("month"));
		Select sel2=new Select(Month);
		sel2.selectByValue("8");
		
		
		WebElement Year = driver.findElement(By.id("year"));
		Select sel3=new Select(Year);
		sel3.selectByValue("2000");*/
		
		//SelectByvisibletext
		
		/*Select sel1=new Select(Day);
		sel1.selectByVisibleText("15");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select sel2=new Select(Month);
		sel2.selectByVisibleText("Jul");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select sel3=new Select(Year);
		sel3.selectByVisibleText("2002");*/
		
		
		//dropdown by xpath
		//driver.findElement(By.xpath("//option[text()='15']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
