package simpleproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//first pull
//second push
public class Facebook {

	public static void main(String[] args) {
	//push to branch
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
	}
}
