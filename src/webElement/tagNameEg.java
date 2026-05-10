package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		
		// create the webElement
		WebElement serachbox = driver.findElement(By.tagName("input"));
		
		// Enter into the search
		serachbox.sendKeys("Laptop");
		
		
		Thread.sleep(1000);
		
		WebElement searchbtutton = driver.findElement(By.tagName("input"));
		searchbtutton.click();
		
		Thread.sleep(4000);
		driver.close();
		
		System.out.println("Run sucessfully");
		
	}

}
