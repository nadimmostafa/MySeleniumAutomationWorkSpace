package org.nadim.iframe.testsccripts;


//Switching between sibling frames is not possible so first we switch to f1 and then
// back to main frame then switch to f2 sibling frame
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_HandingSiblingFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//Switch to top frame
		driver.switchTo().frame("frame-top");
		
		//switch to the inner first frame
		driver.switchTo().frame("frame-left");
		WebElement bodyText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(bodyText.getText());
		
		// back to parent frame
		driver.switchTo().parentFrame();
		
		//switch to the inner second frame
		driver.switchTo().frame("frame-middle");
		WebElement middleText = driver.findElement(By.id("content"));
		System.out.println(middleText.getText());
		
		// back to parent frame
		driver.switchTo().parentFrame();
		
		//switch to the inner 3rd frame
		driver.switchTo().frame("frame-right");
		WebElement rightText = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
		System.out.println(rightText.getText());
		
		//switch to main window
		driver.switchTo().defaultContent();
		
		//switch to bottom frame
		driver.switchTo().frame("frame-bottom");
		WebElement bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(bottomText.getText());
		
		//switch to main window
		driver.switchTo().defaultContent();
		driver.close();
	}

}
