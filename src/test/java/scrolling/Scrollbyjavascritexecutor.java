package scrolling;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbyjavascritexecutor {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//driver.get("https://www.amazon.com/");
		/*driver.get("https://www.flipkart.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0;i<3;i++)
		{
			
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		
		for(int i=0;i<2;i++)
		{
			
			js.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(1000);
		}*/
		/*driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Help']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();*/
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"))
        .click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
		
		
		
			
	}

}
