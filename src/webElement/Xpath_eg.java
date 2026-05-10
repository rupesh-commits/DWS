package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_eg {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// given
		WebElement reg = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a"));
		reg.click();
		
		
		// automatic
		WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a"));
		login.click();
		
		
		WebElement abc = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a"));
		abc.click();
		
		WebElement login1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a"));
		login1.click();
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
