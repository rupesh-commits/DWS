package Optimized;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	
	public static void main(String[] args) {
		
		String browser = "edge";
		
		if(browser.equals("Chrome")) {
			ChromeDriver driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			FirefoxDriver firefoxdriver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			EdgeDriver edgedrver = new EdgeDriver();
		}
		else
		{
			ChromeDriver driver = new ChromeDriver();
		
		}
		 
	}

}
