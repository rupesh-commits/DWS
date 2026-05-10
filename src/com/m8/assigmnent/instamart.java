package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class instamart {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/instamart/");
		
		driver.close();
	}

}
