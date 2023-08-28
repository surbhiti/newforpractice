package popupspackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windowhandelling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(jobs).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		//driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
		String mainid = driver.getWindowHandle();
		System.out.println(mainid);
		Set<String> allids = driver.getWindowHandles();
		for( String id:allids)
		{
			if(!mainid.equals(id))
			{
				driver.switchTo().window(id);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
				
			}
		}
		

	}
	

}
