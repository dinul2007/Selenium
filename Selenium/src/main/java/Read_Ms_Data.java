import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Ms_Data {

	public static void main(String[] args) throws IOException {
		
	XSSFWorkbook wb = new XSSFWorkbook ("./ExcelData/ReadData.xlsx");
	
	// Get Sheet
	XSSFSheet sheet = wb.getSheet("AA");

	// Get Row
	XSSFRow row = sheet.getRow(2);
	// Get Column
	XSSFCell cell = row.getCell(0);
	// Action Read Value
	String value = cell.getStringCellValue();
	
	System.out.println(value);
	
	
	
	
	}

}

