package Verify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.web;

public class elementToBeEnable {
	
	public static void main(String[] args) throws Exception {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement excellent_btn = driver.findElement(By.id("pollanswers-1"));
		
		if(excellent_btn.isEnabled())
		{
			System.out.println("Pass");
			excellent_btn.click();
		}
		else
		{
			driver.close();
			throw new Exception("Test case fail");
			
		}
		Thread.sleep(2000);
		
		driver.close();
	}

}
