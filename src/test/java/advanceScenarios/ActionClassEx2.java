package advanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEx2 {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PW = driver.findElement(By.name("pwd"));
		WebElement Login = driver.findElement(By.id("loginButton"));
		
		Actions act=new Actions(driver);*/
		
		/*act.sendKeys(UN,"admin").perform();
		act.sendKeys(PW,"manager").perform();
		act.click(Login).perform();*/
		
		//act.sendKeys(UN,"admin").sendKeys(PW,"manager").click(Login).perform();
		
		
		
		
		//Action method.....contextclick()
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[contains(@data-action-type,'DISMISS')]")).click();
		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
		Actions act=new Actions(driver);
		act.contextClick(data).perform();
		
		
		//dragAndDrop method
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
