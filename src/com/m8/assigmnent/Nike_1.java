package com.m8.assigmnent;

import java.time.temporal.ChronoField;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nike_1 {
	
	public static void main(String[] args) {

		// open bowswer
		ChromeDriver dobj = new ChromeDriver();
		
		// max the browser 
		dobj.manage().window().maximize();
		 
		// navigate 
		dobj.navigate().to("https://www.nike.com/");
		
		// forword
		dobj.navigate().forward();
		
		// refresh page
		dobj.navigate().refresh();
		
		// prevous page
		dobj.navigate().back();
		
		// close website
		dobj.close();
		
		
	}

}
