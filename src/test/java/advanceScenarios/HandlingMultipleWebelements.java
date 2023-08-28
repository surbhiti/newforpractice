package advanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWebelements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[contains(@class, '_2KpZ6l _2doB4z')]")).click();
	    List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	   
	    int count=0;
	    for(WebElement wb:alllinks)
	    {
	    	System.out.println(wb.getText());
	    	count++;
	    	
	    }
	        System.out.println("all links"+count);
	    
	    
	   /* WebElement search = driver.findElement(By.name("q"));
	    search.sendKeys("bags");
	    Thread.sleep(2000);
	   List<WebElement> mobilesearch = driver.findElements(By.tagName("li"));
	   
	   for(WebElement wb:mobilesearch)
	   {
		   
		   if(wb.getText().contains("bags men travel"))
			   
		   {
			  Thread.sleep(1000);
			   wb.click();
			   break;
			   
		   }
	   }*/
	   

	}

}
