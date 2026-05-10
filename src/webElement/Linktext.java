package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://demowebshop.tricentis.com/");
	
	Thread.sleep(5000);
	
	// Very faster 
	
	driver.findElement(By.linkText("Books")).click();
	
//	
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Shopping")).click();
	
	driver.close();

}
}