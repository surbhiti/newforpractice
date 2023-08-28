package simpleproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.edge.EdgeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class NewProgram {

			public static void main(String[] args) throws Throwable {
			
				WebDriver driver;
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				
				driver.get("https://demo.actitime.com/login.do");
				/*WebElement data = driver.findElement(By.id("username"));
				data.sendKeys("admin");
				System.out.println(data.getAttribute("class"));
				System.out.println(data.getAttribute("type"));*/
				
				/*WebElement data2 = driver.findElement(By.name("pwd"));
				System.out.println(data2.getAttribute("class"));*/
				
				/*WebElement data3 = driver.findElement(By.id("username"));
				System.out.println(data3.getDomProperty("placeholder"));

				
				WebElement data4 = driver.findElement(By.id("loginButton"));
				System.out.println(data4.getDomProperty("class"));
				
				WebElement data5 = driver.findElement(By.id("username"));
			    System.out.println(data5.getAttribute("class"));*/
				
				/*driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(1000);
				WebElement data6 = driver.findElement(By.cssSelector("a.reports"));
				System.out.println(data6.getAccessibleName());*/
				
			 
				
				

	}
}
