package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector1 {
			
		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://demowebshop.tricentis.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Lipstick");
			Thread.sleep(2000);
			                                 //!--- classname :and front of classname put . 
			                                 //if space then remove space and put . 
			driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
			Thread.sleep(2000);
			
			driver.close();

		}

	}



