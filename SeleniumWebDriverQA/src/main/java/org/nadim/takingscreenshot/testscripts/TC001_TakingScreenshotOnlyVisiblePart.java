package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_TakingScreenshotOnlyVisiblePart {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File srcFile = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/image.png");
		
		try {
			//FileHandler.copy(srcFile,destination);
			FileUtils.copyFile(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}

}
