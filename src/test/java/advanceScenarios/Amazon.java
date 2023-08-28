package advanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 /*search.sendKeys("bangles");
		 Thread.sleep(2000);
		 List<WebElement> serachbangle = driver.findElements(By.tagName("div"));
		 for(WebElement wb:serachbangle)
		 {
			 if(wb.getText().contains("bangles stand"));
			 wb.click();
			 break;
			 
		 }*/
		 
		 search.sendKeys("samsung s23 ultra cover");
		 Thread.sleep(2000);
		 List<WebElement> cover = driver.findElements(By.tagName("div"));
		 
		 
		 for(WebElement wb:cover)
		 {
			 if(wb.getText().contains("samsung s23 ultra cover waterproof"));
			 wb.click();
			 break;
			 
		 }

	}

}
