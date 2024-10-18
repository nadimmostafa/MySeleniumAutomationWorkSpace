package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class TC007_TakingScreenshotOfParticularAreaUsingAShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaautomation.expert/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("categories-2"));
		//taking screenshot
		AShot aShot = new AShot();
		Screenshot takeScreenshot = aShot.coordsProvider(new WebDriverCoordsProvider()) //find coordinates with WebDriver API
				  .takeScreenshot(driver, element);
		
		//copy the screenshot to desired location/directory
		ImageIO.write(takeScreenshot.getImage(),"png", new File("./screenshot/particularArea.png"));
		
		driver.close();
	}

}
