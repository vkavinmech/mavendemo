package mavenProjectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createRowAndCell {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\Excelsheet\\testdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Login");
		Row row = sheet.createRow(9);
		Cell cell = row.createCell(2);
		cell.setCellValue("API");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		System.out.println(cell);	
	}

}
