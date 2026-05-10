package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class pumawebsite {
	
	public static void main(String[] args) {
		
		// open browser
		ChromeDriver driver = new ChromeDriver();
		
	    // max browser
		driver.manage().window().maximize();
		
		//open website
		driver.get("https://in.puma.com/in/en");
		
		// close brower
		driver.close();
		
		
		
	}

}
