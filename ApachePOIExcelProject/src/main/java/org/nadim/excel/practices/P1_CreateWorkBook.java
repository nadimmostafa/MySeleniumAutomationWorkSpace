package org.nadim.excel.practices;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.nadim.excel.util.ReadDataFromProperties;

public class P1_CreateWorkBook {

	public static void main(String[] args) throws IOException {
		ReadDataFromProperties p = new ReadDataFromProperties();
		Properties data = p.readData();
		try (FileOutputStream file = new FileOutputStream(data.getProperty("fileNameAndLocation"))) {
			Workbook workbook = new XSSFWorkbook();
			workbook.write(file);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
