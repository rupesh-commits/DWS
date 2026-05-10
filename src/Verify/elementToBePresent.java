package Verify;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.Base;
import Optimized.web;

public class elementToBePresent {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement btn = driver.findElement(By.partialLinkText("Digital downloads"));
		btn.click();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		WebElement add_cart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
       add_cart.click();
		
		driver.findElement(By.className("ico-cart")).click();

		List<WebElement> albm = driver.findElements(By.xpath("//a[text()='3rd album']"));

		if (albm.size() > 0) {
			System.out.println("Product added");
		} else {

			driver.close();
			throw new Exception("Product not added");
		}

	}
}
