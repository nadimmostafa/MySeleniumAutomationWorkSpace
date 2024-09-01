package org.nadim.dataprovider;

import org.nadim.datadrivern.excelutil.ExcelReadUtil;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	String xlxsfilename = "./src/test/resources/applicationLogin.xlsx";
	String sheetName = "Login";

	@DataProvider(name = "excel-data-provider")
	public String[][] getData() {
		return new ExcelReadUtil().readExcelInto2DArray(xlxsfilename, sheetName);
	}
}
