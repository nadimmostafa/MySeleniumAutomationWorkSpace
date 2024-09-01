package org.nadim.datadrivern.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtil {

	public String[][] readExcelInto2DArray(String excelFilePath, String sheetName) {
		String tableArray[][] = null;
		FileInputStream fis = null;
		Workbook workbook = null;
		Row row = null;
		Cell cell = null;

		File f = new File(excelFilePath);

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		try {
			if (excelFilePath.toLowerCase().endsWith("xls")) {
				workbook = new HSSFWorkbook(fis);
			} else if (excelFilePath.toLowerCase().endsWith("xlsx")) {
				workbook = new XSSFWorkbook(fis);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// get sheet from workbook;

		Sheet sheet = workbook.getSheet(sheetName);

		// find totaol row;

		int totalRow = sheet.getLastRowNum();
		//System.out.println(totalRow);
		row = sheet.getRow(1);
		int totalCell = row.getLastCellNum();
		//System.out.println(totalCell);
		
		tableArray = new String[totalRow+1][totalCell];

		for (int i = 0; i <= totalRow; i++) {
			row = sheet.getRow(i);

			for (int j = 0; j<totalCell; j++) {
				cell = row.getCell(j);
				//System.out.println(cell+" "+i+" "+j);
				
				
				CellType cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					tableArray[i][j] = cell.getStringCellValue();
					break;
				case BOOLEAN:
					tableArray[i][j] = String.valueOf(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					tableArray[i][j] = String.valueOf(cell.getNumericCellValue());
				default:
					tableArray[i][j] = "";
				}
			}
		}

		return tableArray;
	}
}
