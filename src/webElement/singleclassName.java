package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleclassName {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		
		WebElement searchfiled = driver.findElement(By.className("search-box-text"));
		
		searchfiled.sendKeys("Laptop");
		
		WebElement searhButton  = driver.findElement(By.className("button-1"));
		
		searhButton.click();
		
		driver.navigate().back();
		
		
		driver.findElement(By.name("q")).sendKeys("chocolate");
		driver.findElement(By.className("button-1")).click();
//		
		Thread.sleep(3000);
		
		driver.close();
	
		
		
	}

}
