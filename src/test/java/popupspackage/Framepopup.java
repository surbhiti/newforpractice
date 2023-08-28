package popupspackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Framepopup {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable");
    driver.switchTo().frame(0);
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By.id("droppable"));
    
  Actions act = new Actions(driver);
 act.dragAndDrop(drag, drop).perform();
    
	}

}
