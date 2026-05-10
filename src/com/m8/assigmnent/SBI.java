package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://onlinesbi.sbi.bank.in/");
		
		driver.close();
	}
}
