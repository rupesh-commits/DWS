package com.m8.assigmnent;

import org.openqa.selenium.chrome.ChromeDriver;

public class puma1 {
	
	public static void main(String[] args) {
		
		// open browser
		ChromeDriver cobj= new ChromeDriver();
		
		// max the browswer
		 cobj.manage().window().maximize();
		 
		 // navigate
		cobj.navigate().to("https://www.nike.com/");
		
		// close web
		cobj.close();
	}

}
