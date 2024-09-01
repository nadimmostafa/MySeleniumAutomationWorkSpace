package org.nadim.excel.practices;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P5_ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException {

		String filename = "G:\\02. Automation Testing\\Automation Testing Framework\\01. TestNG\\myworkbook.xlsx";
		FileInputStream file = new FileInputStream(filename);
		Workbook workbook = null;

		if (filename.toLowerCase().endsWith("xls")) {
			workbook = new XSSFWorkbook(file);
		} else if (filename.toLowerCase().endsWith("xlsx")) {
			workbook = new XSSFWorkbook(file);
		}

		Sheet sheet = workbook.getSheet("LoginData");

		int lastRowNum = sheet.getLastRowNum();
		for (int i = 0; i <= lastRowNum; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j <row.getLastCellNum(); j++) {

				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"  ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"  ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}

			}
			System.out.println();
		}
	}

}
