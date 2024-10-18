package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TC005_TakingScreenshotUsingAShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaautomation.expert/");
		
		//taking screenshot
		AShot aShot = new AShot();
		AShot shootingStrategy = aShot.shootingStrategy(ShootingStrategies.viewportPasting(10000));
		Screenshot takeScreenshot = shootingStrategy.takeScreenshot(driver);
		
		//Screenshot takeScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		
		
		//copy the screenshot to desired location/directory
		ImageIO.write(takeScreenshot.getImage(),"png", new File("./screenshot/ashot.png"));
		
		driver.close();
	}

}
