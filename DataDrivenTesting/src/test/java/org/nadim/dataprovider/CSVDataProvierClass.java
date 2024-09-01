package org.nadim.dataprovider;

import java.io.FileReader;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class CSVDataProvierClass {

	public Iterator<String[]> getCSVData() {
		Iterator<String[]> iterator=null;
		try {
			CSVReader reader = new CSVReader(new FileReader("./src/test/resources/csv-data.csv"));
			iterator = reader.readAll().iterator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iterator;
	}

	@DataProvider(name = "csv-data-provider")
	public Iterator<String[]> getCredentialLoginData() {
		return getCSVData();
	}
}
