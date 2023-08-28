package scrolling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartiphoneprint {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"))
        .click();
     WebElement search = driver.findElement(By.name("q"));
     
        search.sendKeys("iphone");
       
       search.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       List<WebElement> all = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
       
        int count=0;
	    for(WebElement wb:all)
	    {
	    	System.out.println(wb.getText());
	    	count++;
	    	
	    }
	        System.out.println("all links"+count);
	  
       /*for(int i=0;i<all.size();i++)
	    {
	    	System.out.println(all.get(i).getText());
	    	
	    	
	    }*/
	       
	        
	        
	    
      
     
     
	}

}
