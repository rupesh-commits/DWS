package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Adidas1 {
	
	public static void main(String[] args) {
		
		// open browser
		ChromeDriver driver = new ChromeDriver();
		
		// max browser
		driver.manage().window().maximize();
		
		// open web
		driver.navigate().to("https://www.reebok.com/");
		
		// close web
		driver.close();
		
		
	}

}
