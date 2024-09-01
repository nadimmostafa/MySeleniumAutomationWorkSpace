package org.nadim.excel.practices;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P4_CreateWorkbookSheetRowAndCellValue {

	public static void main(String[] args) throws IOException {
		String filelocation = "./src/main/resources/myworkbook.xlsx";
		FileOutputStream file = new FileOutputStream(filelocation);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("userData");

		// Data in 2D array format
		Object[][] excelInputData = { { "nadim26", "nadim26@gmail.com", 6734 }, 
				{ "Asif", "a72@gmail.com" },
				{ "saddam", "saddam276@gmail.com", 9876 } };
		int totalrow = excelInputData.length;
		Row row = null;
		Cell cell = null;
		int col = 0;
		for (int i = 0; i < totalrow; i++) {
			col = excelInputData[i].length;
			row = sheet.createRow(i);
			for (int j = 0; j < col; j++) {
				
				cell = row.createCell(j);
				
				Object userData = excelInputData[i][j];
				if (userData instanceof String) {
					cell.setCellValue((String)userData);
				}else if(userData instanceof Integer) {
					cell.setCellValue((Integer)userData);
				}else if(userData instanceof Boolean) {
					cell.setCellValue((Boolean)userData);
				}
			}
		}
		
		workbook.write(file);
		System.out.println("Data saved");
		workbook.close();
	}

}
