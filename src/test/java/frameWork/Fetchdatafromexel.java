package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdatafromexel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("./properties_data.properties.txt");
		
		Properties pro = new Properties();
		pro.load(fis);
		String URL1 = pro.getProperty("url1");
		driver.get(URL1);
		
		FileInputStream fes = new FileInputStream("./Frameworkdata.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		
		Sheet sh = book.getSheet("Sheet1");
	
		Row row = sh.getRow(4);
		Cell cell = row.getCell(4);
		String data = cell.getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data,Keys.ENTER);
		
		
	}

}
