package VerifyPageUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.web;

public class byElement {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//strong[text()='Community poll']"));
			System.out.println("i am in dws page"); 
			
		}
		catch(Exception e){
			driver.close();
			throw new Exception("testcase fail and im not in dws page");
		}
		
		driver.close();
		
	}

}
