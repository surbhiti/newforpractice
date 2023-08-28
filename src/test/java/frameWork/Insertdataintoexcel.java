package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Insertdataintoexcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fes1 = new FileInputStream("./Frameworkdata.xlsx");
		Workbook book = WorkbookFactory.create(fes1);
		Sheet sh = book.getSheet("Sheet1");
		Row row = sh.createRow(3);
		Cell cell = row.createCell(3);
		cell.setCellValue("makeup");
		
		FileOutputStream fos = new FileOutputStream("./Frameworkdata.xlsx");
		book.write(fos);
		book.close();

	}

}
