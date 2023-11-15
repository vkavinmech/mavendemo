package mavenProjectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelOmrLabels {

		public static void main(String[] args) throws IOException {
			
			File file = new File("C:\\Users\\vrkav\\eclipse-workspace\\mavenDemo\\src\\test\\java\\Excelsheet\\testdata.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
		
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				
				Row row = sheet.getRow(i);	
			
			System.out.println("\n"+i+"\n");   // row by row all column name printed
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
						CellType cl = cell.getCellType();
					switch (cl) {
					case STRING:
						String s = cell.getStringCellValue();
						System.out.println(s);
						break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dc = cell.getDateCellValue();
							SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yy");
							String format = df.format(dc);
							System.out.println(format);
						}
						else
						{
						double d = cell.getNumericCellValue();
					// BigDecimal b = BigDecimal.valueOf(d);
						long check = Math.round(d);
						if(d==check) {
						String vl = String.valueOf(check);
						System.out.println(vl);
						}
						else {
							String s2 = String.valueOf(d);
							System.out.println(s2);
						}
						break;
						}
					default:
						break;
						
					}
				}
			}
	}

}
