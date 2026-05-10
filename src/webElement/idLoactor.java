package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLoactor {

		
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://demowebshop.tricentis.com/");
			
			Thread.sleep(5000);
			
			// Very faster 
			driver.findElement(By.id("small-searchterms")).sendKeys("Unique");
			
//			
			Thread.sleep(3000);
			
			driver.close();
		
			
			
		}

	}



