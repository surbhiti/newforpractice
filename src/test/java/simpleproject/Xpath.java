

		package simpleproject;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.edge.EdgeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Xpath{

			public static void main(String[] args) throws Throwable {
			
				WebDriver driver;
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				//driver.get("https://demo.actitime.com/login.do");
				//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
				//driver.get("https://www.flipkart.com/");
				//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				//Thread.sleep(1000);
				//driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
				driver.get("https://demo.actitime.com/login.do");
				driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
				driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("manager");
				driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
				
				
			}
		

	}


