package popupspackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
		driver.findElement(By.xpath("//button[text()='click']")).click();
		//driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String Id:allIds)
		{
			driver.switchTo().window(Id);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Selenium"))
				
			{
				driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
				
			}
			driver.quit();
			
		
	}
	

}}
