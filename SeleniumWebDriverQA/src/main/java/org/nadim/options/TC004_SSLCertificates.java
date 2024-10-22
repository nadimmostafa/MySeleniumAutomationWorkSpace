package org.nadim.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC004_SSLCertificates {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		//option.addArguments("--ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		//driver.close();
	}

}
