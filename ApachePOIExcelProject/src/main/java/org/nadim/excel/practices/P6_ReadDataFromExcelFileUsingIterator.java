package org.nadim.excel.practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P6_ReadDataFromExcelFileUsingIterator {

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
		Iterator<Row> iterator = sheet.iterator();

		while (iterator.hasNext()) {
			Row row = iterator.next();
			Iterator<Cell> cellIterator = row.iterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				CellType cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"  ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"  ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"  ");
					break;
				}
			}

			System.out.println();
		}
	}

}
