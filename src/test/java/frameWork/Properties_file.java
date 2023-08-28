package frameWork;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homepage;
import POM.LoginPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Properties_file {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	//step:-connect java with properties file
	FileInputStream fis = new FileInputStream("./properties_data.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String URL =pro.getProperty("url");
	String UN = pro.getProperty("username");
	
    String PW = pro.getProperty("password");
	driver.get(URL);
	
	//driver.findElement(By.id("username")).sendKeys(UN);
	//driver.findElement(By.name("pwd")).sendKeys(PW);
	
	//driver.findElement(By.cssSelector("a.initial")).click();\
	
	//By using POM class
	
	LoginPage login = new LoginPage(driver);
	login.LoginToApplication(UN, PW);
	
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[contains(@class,'content tasks')]")).click();
	Homepage home = new Homepage(driver);
	home.homePageapp();
	
	
	

	}

}
