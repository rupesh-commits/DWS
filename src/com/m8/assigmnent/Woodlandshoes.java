package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Woodlandshoes {
	
	public static void main(String[] args) {
		
		// open broweser
		ChromeDriver driverobj = new ChromeDriver();
		
		// max browser
		driverobj.manage().window().maximize();
		
		// open web
		driverobj.get("https://www.woodlandworldwide.com");
	
		
		
		// close browser
		driverobj.close();
		
		
	}

}
