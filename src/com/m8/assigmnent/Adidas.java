package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Adidas {
	
	public static void main(String[] args) {
		
		// open browswer
		ChromeDriver driverobj = new ChromeDriver();
		
		// max broswer
		driverobj.manage().window().maximize();
		
		// open website
		driverobj.get("https://www.reebok.com/");
		
		// close
		driverobj.close();
		
		
		
		
	}

}
