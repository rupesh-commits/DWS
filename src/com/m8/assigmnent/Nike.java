package com.m8.assigmnent;


import org.openqa.selenium.chrome.ChromeDriver;

public class Nike {
	public static void main(String[] args) {
		
		// open broswer
		ChromeDriver driverobj = new ChromeDriver();
		
		// browswer max
		driverobj.manage().window().maximize();
		
		// open website
		driverobj.get("https://www.nike.in/");
		
		//close browser
		driverobj.close();
	}

}
