package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Blinkit {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blinkit.com/");
		
		driver.close();
	}
}
