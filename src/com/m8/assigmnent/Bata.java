package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bata {
	
	public static void main(String[] args) {
		
		// open browser
		ChromeDriver driver_obj = new ChromeDriver();
		
		// max broswer
		driver_obj.manage().window().maximize();
		
		// open website
		driver_obj.get("https://www.bata.com/in/");
		
		// close broswer
		driver_obj.close();
		
		
	}

}
