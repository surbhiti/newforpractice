package popupspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Browsernavigation {

	public static void main(String[] args) {
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.com/");*/
		
		EdgeOptions options1 = new EdgeOptions();
		options1.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(options1);
		
		driver.get("https://www.amazon.com/");
		
		
		
	}

}
