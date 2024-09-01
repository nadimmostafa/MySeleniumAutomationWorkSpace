package org.nadim.excel.practices;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P7_SetCellBGColorAndBorder {

	public static void main(String[] args)throws IOException {
		String xlsxFile = "./file/application.xlsx";
		File f = new File(xlsxFile);
		if(!f.exists()) {
			f.createNewFile();
		}
		FileOutputStream file = new FileOutputStream(f);
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("RegData");
		
		Row firstRow = sheet.createRow(0);
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		//create cell and set cell value
		
		Cell cell = firstRow.createCell(0);
		cell.setCellValue("First Name");
		cell.setCellStyle(cellStyle);
		
		Cell cell2 = firstRow.createCell(1);
		cell2.setCellValue("Last Name");
		cell2.setCellStyle(cellStyle);
		
		workbook.write(file);
		System.out.println("Saved");
		workbook.close();
	}

}
