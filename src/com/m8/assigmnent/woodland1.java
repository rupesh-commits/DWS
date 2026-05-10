package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class woodland1 {
	
	public static void main(String[] args) {
		
		ChromeDriver dobj = new ChromeDriver();
		
		// max browser
		dobj.manage().window().maximize();
		
		// navigate
		dobj.navigate().to("https://www.woodlandworldwide.com/");
		
		dobj.close();
	}

}
