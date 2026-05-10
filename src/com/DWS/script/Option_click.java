package com.DWS.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Option_click {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		excellent.click();
		
		WebElement good = driver.findElement(By.id("pollanswers-2"));
		good.click();
		
		WebElement avg = driver.findElement(By.id("pollanswers-3"));
		avg.click();
		
		WebElement vote_btn3 = driver.findElement(By.id(""));
		vote_btn3.click();
		
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
