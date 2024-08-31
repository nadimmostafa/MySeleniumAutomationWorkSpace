package org.nadim.util;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public Properties readPropertiesData() {
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
			properties.load(fis);

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

		return properties;
	}
}
