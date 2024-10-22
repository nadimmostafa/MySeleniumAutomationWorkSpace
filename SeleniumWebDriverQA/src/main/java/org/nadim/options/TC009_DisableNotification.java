package org.nadim.options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC009_DisableNotification {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<>();
		// 0 - Default, 1 - Allow, 2 - Block
		//disabled location
		prefs.put("profile.default_content_setting_values.geolocation",2);
		//disable notification
		prefs.put("profile.default_content_setting_values.notifications",2);
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		option.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
	}

}
