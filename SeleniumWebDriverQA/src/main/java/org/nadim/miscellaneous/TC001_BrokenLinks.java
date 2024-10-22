package org.nadim.miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.link-city.co/");
		
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		System.out.println(anchorTags.size());
		
		for(WebElement element:anchorTags) {
			String href = element.getAttribute("href");
			
			if(href != null ) {
				if(href.isEmpty()) {
					verifyLink(href);
				}
			}
			
		}
		
		driver.close();;
	}

	private static void verifyLink(String href) throws IOException {
		
		try {
			//convert link string to URL format 
			URL url = new URL(href);
			
			//establish connection
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000);
			
			//connect to the server and send request to server
			con.connect();
			
			//check response code
			if(con.getResponseCode()>=400) {
				System.out.println(href+ " is Broken");
			}else {
				System.out.println(href+" is Valid "+ con.getResponseMessage());
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
