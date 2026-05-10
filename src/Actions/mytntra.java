package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Optimized.web;

public class mytntra {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		Thread.sleep(2000);

		Actions section = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		section.moveToElement(men).perform();

		//Always go for param methods   // ctrl +shift+ c
		
		WebElement joggers = driver.findElement(By.xpath("//a[text()='Track Pants & Joggers']"));
		section.click(joggers).perform();
	}
}
