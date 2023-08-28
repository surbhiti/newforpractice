package popupspackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.cssSelector("[class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.id("file-upload"));
		
		
		data.sendKeys("C:\\Users\\Dell\\Desktop\\camapign data.txt");
		
	}

}
