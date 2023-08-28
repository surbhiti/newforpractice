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

		public class Facebook {

			public static void main(String[] args) throws Throwable {
			
				WebDriver driver;
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				
				driver.get("https://www.facebook.com/");
				//driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("surbhitiwari70@gmail.com");
				//driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("navneetritu");
				//driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
				//WebElement data = driver.findElement(By.xpath("//a[contains(@class,'_41ug')]"));
				//Point location = data.getLocation();
				//System.out.println( location.getX());
				//System.out.println( location.getY());
				/*WebElement data1 = driver.findElement(By.xpath("//a[contains(@class,'_41ug')]"));
				Dimension size = data1.getSize();
				System.out.println(size.getHeight());
				System.out.println(size.getWidth());*/
				
				WebElement data2 = driver.findElement(By.xpath("//a[contains(@class,'_41ug')]"));
				Rectangle rec = data2.getRect();
				System.out.println(rec.getX());
				System.out.println(rec.getY());
				System.out.println(rec.getHeight());
				System.out.println(rec.getWidth());
				
				
				
				
				//driver.get("https://demo.actitime.com/login.do");
				/*WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'atLogoImg')]"));
				if(logo.isDisplayed())
				{
					System.out.println("displayed");
				}
				
				else
				{
					System.out.println("not displayed");
				}	*/
				
				/*WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
				if(username.isEnabled())
				{
				username.sendKeys("admin");
				}
				else
				{
					System.out.println("un not selected");
				}*/
				
				
			      /*WebElement checkbox = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
			      
			      if(checkbox.isSelected())
					{
						System.out.println("checked");
					}
					
					else
					{
						System.out.println("not checked");
					}*/
				/*WebElement type = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
				Thread.sleep(1000);
			    String value = type.getAriaRole();
			    System.out.println(value);*/
				
				 
				
			}
		}