package org.nadim.takingscreenshot.testscripts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_TakingScreenshotUisngBase64 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		File destination = new File("./screenshot/google.png");
		FileOutputStream fos = new FileOutputStream(destination);
		fos.write(Base64.decodeBase64(screenshotAs));
	}

}
