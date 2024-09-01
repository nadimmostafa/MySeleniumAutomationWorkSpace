package org.nadim.excel.practices;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P3_CreatingWorkbookSheetRowCellValue1 {

	public static void main(String[] args)throws IOException {
		String xlsxFile = "G:\\02. Automation Testing\\Automation Testing Framework\\01. TestNG\\Application.xlsx";
		FileOutputStream fos = new FileOutputStream(xlsxFile);
		//create workbook
		Workbook workbook = new XSSFWorkbook();
		//create sheet and provide sheet name
		Sheet sheet = workbook.createSheet("LoginData");
		
		//create first row
		Row firstRow = sheet.createRow(0);
		//create cell and set value as Header
		firstRow.createCell(0).setCellValue("Username");
		firstRow.createCell(1).setCellValue("Password");
		firstRow.createCell(2).setCellValue("Gmail");
		firstRow.createCell(3).setCellValue("IsValid");
		
		//create second row
		Row secondRow = sheet.createRow(1);
		secondRow.createCell(0).setCellValue("nadim26");
		secondRow.createCell(1).setCellValue("5612@jh");
		secondRow.createCell(2).setCellValue("nadim26@gmail.com");
		secondRow.createCell(3).setCellValue(true);
		
		workbook.write(fos);
		
		System.out.println("Data Saved");
		workbook.close();
	}

}
