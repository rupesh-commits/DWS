package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.web;

public class single_alert_boc {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Alert al = driver.switchTo().alert();

		Thread.sleep(3000);
		System.out.println(al.getText());

		al.accept();
		Thread.sleep(3000);

		driver.quit();
	}
}
