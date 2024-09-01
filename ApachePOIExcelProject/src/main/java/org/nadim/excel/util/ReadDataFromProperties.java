package org.nadim.excel.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	
	public Properties readData() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("./src/main/resources/fileLoaction.properties");
		properties.load(file);
		return properties;
	}
}
