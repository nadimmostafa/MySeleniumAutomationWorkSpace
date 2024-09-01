package org.nadim.datadrivern.excelutil;

public class ReadUtilClassData {

	public static void main(String[] args) {
		String xlxsfilename = "./src/test/resources/applicationLogin.xlsx";
		String sheetName = "Login";
		ExcelReadUtil e = new ExcelReadUtil();
		String[][] excelInto2DArray = e.readExcelInto2DArray(xlxsfilename, sheetName);
		
		for(String[] row:excelInto2DArray) {
			for(String col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
