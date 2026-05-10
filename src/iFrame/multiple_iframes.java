package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_iframes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");

		Thread.sleep(2000);
	
//		WebElement default_btn = driver.findElement(By.xpath("//section[text()='Frames']"));
//		default_btn.click();
//
//		Thread.sleep(2000);
//
//		WebElement default_btn1 = driver.findElement(By.xpath("//section[text()='iframes']"));
//		default_btn1.click();
		
		driver.switchTo().frame(0);

		Thread.sleep(2000);

		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("admin");

		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("admin");

		Thread.sleep(2000);

		WebElement login_btn = driver.findElement(By.id("submitButton"));
		login_btn.click();

		Thread.sleep(2000);

		driver.switchTo().parentFrame();
		System.out.println("Doen");

	}

}
