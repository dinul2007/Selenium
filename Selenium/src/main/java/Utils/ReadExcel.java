package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	//public static String[][] main(String[] args) throws IOException {
	  
	public String[][] ReadExcel() throws IOException{	
		
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelData/Read_Data.xlsx");
		
		//Get Sheet
		//XSSFSheet sheet = wb.getSheet("AA");
		XSSFSheet sheet = wb.getSheetAt(0);
		// row count
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		//column count
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data = new String[rowcount][columnCount];
		
		//open for loop for Row
		for (int i = 1; i <=rowcount; i++) {
			// get Row
			XSSFRow row = sheet.getRow(i);
			
	    // open for loop for Column
			
		for (int j = 0; j <columnCount; j++) {
			// get column
			XSSFCell cell = row.getCell(j);
			// Action read value
			String value = cell.getStringCellValue();
			System.out.println(value);
			
			data[i-1][j]= value;
			
		}
			
		}
			
		return data;
		}

	}


