package org.nadim.options;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC005_SettingProxy {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		//proxy.setHttpProxy("host:port")
		proxy.setHttpProxy("192.168.90.1:9901");
		
		ChromeOptions option = new ChromeOptions();
		option.setProxy(proxy);
		//option.setCapability("proxy", proxy);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//driver.close();
	}

}
