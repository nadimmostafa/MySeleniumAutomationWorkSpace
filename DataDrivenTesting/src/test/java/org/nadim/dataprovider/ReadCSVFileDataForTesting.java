package org.nadim.dataprovider;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadCSVFileDataForTesting {

	public static void main(String[] args) throws IOException, CsvException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/csv-data.csv"));
		
		List<String[]> all = reader.readAll();
		
		// print in array format
		for(String[] data:all) {
			System.out.println(Arrays.toString(data));
		}
		
		
		//print string formt
		for(String[] data:all) {
			
			for(String d:data) {
				System.out.print(d+" ");
			}
			System.out.println();
		}

	}

}
