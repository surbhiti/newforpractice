package advanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGelements {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//svg:-scalable vector Graphics
		//syntax:--//*[name()='svg']
		//driver.findElement(By.xpath("//*[name()='svg' and @class= 'gb_h']")).click();
		//Thread.sleep(2000);
		
		//svg:-scalable vector Graphics
		//syntax:--//*[name()='svg']
		//Screen sc = new Screen();
		//Pattern icon = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\simpleproject\\youtube.png");
		//sc.click();
		
	}

}
