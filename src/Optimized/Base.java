package Optimized;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver = null;
	
	public static void preCondition()
	{
		String browser = "Firefox";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		     driver = new EdgeDriver();
		}
		else
		{
			 driver = new ChromeDriver();
		
		}
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	 
	public static void login() throws InterruptedException
	{
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("mnp@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		
		// remenber me selecred
	}
	
	
	
	public static void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
	}

	public static void postCondition()
	{
		driver.close();
	}
}
