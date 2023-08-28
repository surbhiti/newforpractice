package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFW {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./flipkartfw.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		driver.get(URL);
		
		
		
	}

}
