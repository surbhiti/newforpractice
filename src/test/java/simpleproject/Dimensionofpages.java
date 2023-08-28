package simpleproject;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dimensionofpages {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		Dimension dim = new Dimension(500,600);
		
		driver.manage().window().setSize(dim);
		
		Point point = new Point(200,300);
		driver.manage().window().setPosition(point);

	}

}
