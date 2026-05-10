package com.DWS.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
    public static void main(String[] args) throws InterruptedException {
    	
    	ChromeDriver driver  = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.navigate().to("https://demowebshop.tricentis.com/");
    	
    	
    	WebElement link = driver.findElement(By.className("ico-register"));
    	link.click();
    	
    	
    	
    	Thread.sleep(2000);
    	
    	WebElement link2 = driver.findElement(By.className("ico-login"));
    	link2.click();
    	
    
    	
    	Thread.sleep(2000);
    	
    	WebElement link3 = driver.findElement(By.className("ico-cart"));
    	link3.click();
    	
    
    	
    	Thread.sleep(2000);
    	
    	WebElement link4 = driver.findElement(By.className("ico-wishlist"));
    	link4.click();
    	
   
    	
    	
    	Thread.sleep(2000);
    	
    	driver.close();
    	
    	
		
	}

}
