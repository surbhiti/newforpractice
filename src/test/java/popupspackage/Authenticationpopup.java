package popupspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationpopup {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://username:password@url")
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
