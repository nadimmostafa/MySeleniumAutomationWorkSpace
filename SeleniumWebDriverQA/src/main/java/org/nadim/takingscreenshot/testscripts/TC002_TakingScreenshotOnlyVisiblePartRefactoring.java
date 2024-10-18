package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TC002_TakingScreenshotOnlyVisiblePartRefactoring {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		try {
			FileHandler.copy(((TakesScreenshot)driver)
					.getScreenshotAs(OutputType.FILE),new File("./screenshot/image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}

}
