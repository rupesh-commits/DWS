package Optimized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class web extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		searchbox.sendKeys("Mouse");
		Thread.sleep(2000);
		WebElement search_btn = driver.findElement(By.cssSelector(".button-1.search-box-button"));
		search_btn.click();
		Thread.sleep(2000);
		logout();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
		System.out.println("Done");
	}

}
