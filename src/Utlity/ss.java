package Utlity;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
	
	public static String dynamicNameWithDateAndTime(String name)
	{
		String dynamic = LocalDateTime.now().toString().replaceAll(":", "-");
		
		String filename= name+dynamic;
		return filename;
		
	}
	
	public static void takeWebPageScreenshot(WebDriver driver , String path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(path);
		FileHandler.copy(from, to);
		
		 
	}

}















