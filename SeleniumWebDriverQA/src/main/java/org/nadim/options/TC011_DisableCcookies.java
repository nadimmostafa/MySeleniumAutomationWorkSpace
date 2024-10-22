package org.nadim.options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC011_DisableCcookies {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<>();
		// 0 - Default, 1 - Allow, 2 - Block
		prefs.put("profile.default_content_setting_values.cookies",2);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		//option.addArguments("--disable-cookies");//not working
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		
		
		int size = driver.manage().getCookies().size();
		if(size>0) {
			System.out.println("Cookies is enable");
		}else {
			System.out.println("Cookies is Disable");
		}
		
		driver.close();
	}

}
