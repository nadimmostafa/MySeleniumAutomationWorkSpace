package org.nadim.excel.practices;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.nadim.excel.util.ReadDataFromProperties;

public class P2_CreateWorkSheet {

	public static void main(String[] args) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		ReadDataFromProperties rd = new ReadDataFromProperties();
		Properties pData = rd.readData();
		
		try(OutputStream f = new FileOutputStream(pData.getProperty("fileLocation"))){
			Sheet s1 = workbook.createSheet("LoginData");
			Sheet s2 = workbook.createSheet("RegData");
			workbook.write(f);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
