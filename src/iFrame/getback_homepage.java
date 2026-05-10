package iFrame;

import java.time.chrono.ChronoZonedDateTime;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.web;

public class getback_homepage {

public static void main(String[] args) throws InterruptedException {
	
	
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	Thread.sleep(2000);
	
	WebElement btn = driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
	btn.click();
	Thread.sleep(2000);
	
	
	WebElement frame1 = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	driver.switchTo().frame(frame1);


	Thread.sleep(2000);

	WebElement frame2 = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	driver.switchTo().frame(frame2);

	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ram");
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	WebElement home_btn = driver.findElement(By.partialLinkText("Home"));
	home_btn.click();

	
}
}
