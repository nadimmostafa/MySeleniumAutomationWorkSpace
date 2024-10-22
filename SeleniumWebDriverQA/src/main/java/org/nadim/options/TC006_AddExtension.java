package org.nadim.options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC006_AddExtension {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		File addBlockLoc = new File("./Plugins/AdBlock.crx");
		option.addExtensions(addBlockLoc);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://text-compare.com/");
		//driver.close();
	}

}
