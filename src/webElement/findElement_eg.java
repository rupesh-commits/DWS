package webElement;

import java.awt.Desktop.Action;
import java.awt.print.Pageable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

public class findElement_eg {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromiumDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
	
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']//a"));
		for(int i=1;i<=links.size();i++)
		{
			links.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
				System.out.println("done");
	}

}
