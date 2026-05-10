package VerifyPageUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		
		String actual_title  = "Demo Web Shop. Books";
		String expected_title  =driver.getTitle();
		
		Thread.sleep(2000);
		if(actual_title.equals(expected_title))
		{
			System.out.println("Book tilte is same");
		}
		else
		{      driver.close();
			System.out.println("Book tilte is same");
		}
		Thread.sleep(2000);
		
		driver.close();
			
		
	}

}
