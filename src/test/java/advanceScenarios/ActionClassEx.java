package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEx {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		/*driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[contains(@class, '_2KpZ6l _2doB4z')]")).click();
	    WebElement data = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(data).click().perform();*/
		/*driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[contains(@data-action-type,'DISMISS')]")).click();
		WebElement data1 = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Actions act=new Actions(driver);
		act.moveToElement(data1).click().perform();*/
		
		Actions act1=new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement value = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act1.doubleClick(value).perform();
		

	}

}
