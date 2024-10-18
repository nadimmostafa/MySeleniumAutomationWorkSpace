package org.nadim.takingscreenshot.testscripts;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC008_TakingScreenshotUsingRobot {

	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("alert('hello, Robot')");
		
		Robot robot = new Robot();
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r = new Rectangle(dm);
		BufferedImage bimg = robot.createScreenCapture(r);
		
		ImageIO.write(bimg, "png", new File("./screenshot/robot.png"));
	}

}
