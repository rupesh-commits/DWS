package WindowHandles;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

import Optimized.web;

public class Notification_handled {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromiumDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(2000);

		Robot bot = new Robot();
		
		// Ap1 
//		bot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//
//		bot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//
//		bot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//
//		bot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//
//		bot.keyRelease(KeyEvent.VK_TAB);
//
//		bot.keyPress(KeyEvent.VK_ENTER);
//		
//		System.out.println("Done");
		
		// ap2 
		
		for(int i=0;i<=2;i++)
		{
			bot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_ENTER);
	
		
		

		
	

	}

}
