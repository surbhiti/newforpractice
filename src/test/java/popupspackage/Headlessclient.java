package popupspackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
public class Headlessclient {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---headless--");//--disable notification
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.naukri.com");
	}

}
