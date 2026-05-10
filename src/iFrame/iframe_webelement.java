package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_webelement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(2000);

		// name
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ram");

		Thread.sleep(2000);
		// value
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramesh");

	}

}
