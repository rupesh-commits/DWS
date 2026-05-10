package Optimized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FunctionTestCase extends Base {
	
	public static void testcase1() throws InterruptedException
	{
		preCondition();
		Thread.sleep(2000);
		login();
		System.out.println("This test 1");
		Thread.sleep(2000);
		logout();
		postCondition();
	}
	
	
	public static void testcase2() throws InterruptedException
	{
		System.out.println("This test 2");
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
		
		postCondition();
	}
	
	public static void testcase3() throws InterruptedException
	{
		System.out.println("This test 3");
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
	}
	
	public static void testcase4() throws InterruptedException
	{
		System.out.println("This test 4");
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
		postCondition();
	}
	
	public static void testcase5() throws InterruptedException
	{
		System.out.println("This test 5");
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
		
		postCondition();
	}
	
	

}
