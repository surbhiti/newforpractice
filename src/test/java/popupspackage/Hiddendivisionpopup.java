package popupspackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Hiddendivisionpopup {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PW = driver.findElement(By.name("pwd"));
		WebElement Login = driver.findElement(By.id("loginButton"));
		
		Actions act=new Actions(driver);
		act.sendKeys(UN,"admin").sendKeys(PW,"manager").click(Login).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'content tasks')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox inactive')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'delete button')]")).click();
		
		
	}

}
