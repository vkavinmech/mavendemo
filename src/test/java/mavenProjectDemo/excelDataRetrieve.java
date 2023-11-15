package mavenProjectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataRetrieve {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\Excelsheet\\testdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Login");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		int count = sheet.getPhysicalNumberOfRows();
		System.out.println(count);
	}

}
