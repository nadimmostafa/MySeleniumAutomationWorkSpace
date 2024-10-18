package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TC004_TakingScreenshotParticularElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.id("gb"));
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshot/elementImage.png");
		FileHandler.copy(srcFile, destination);
		driver.close();
	}

}
