package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTagname {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		
//		driver.get("https://demowebshop.tricentis.com/");
//
//		Thread.sleep(2000);
//		
//		WebElement newsletter = driver.findElement(By.xpath("(//strong)[4]"));
//	    System.out.println(newsletter.getText());
//		 
	    driver.get("https://demowebshop.tricentis.com/digital-downloads");

	    
		// Sibling traversing
		
		//WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
		//System.out.print(price.getText());
		
		WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
		System.out.print(price.getText());
		
		Thread.sleep(1000);
//		WebElement price1 = driver.findElement(By.xpath("//a[text()='1st released']/../following-sibling::div[3]/div[1]/span"));
//		System.out.print(price1.getText());
		
	}

}
