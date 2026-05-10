package com.m8.assigmnent;

import java.time.temporal.ChronoField;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cosmos {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.cosmos.bank.in/");
		
		driver.close();
	}

}
