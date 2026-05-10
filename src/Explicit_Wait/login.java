package Explicit_Wait;

import java.rmi.server.ExportException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Optimized.web;

public class login {

	public static void main(String[] args) throws InterruptedException {

		ChromiumDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// method :1
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
//

// method: 2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
		WebElement Login_btn = driver.findElement(By.xpath("//button[@name='loginBtn']"));
		Login_btn.click();
	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		
		WebElement create_acc_btn = driver.findElement(By.xpath("//span[text()='Create Account']"));
		create_acc_btn.click();

		
		
		
		Thread.sleep(2000);
	}
}
