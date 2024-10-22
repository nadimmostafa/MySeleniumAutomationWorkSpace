package org.nadim.options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC010_LocationPopUp {

	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<>();
		// 0 - Default, 1 - Allow, 2 - Block
		prefs.put("profile.default_content_setting_values.geolocation",2);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/geolocation");
		driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
	}

}
