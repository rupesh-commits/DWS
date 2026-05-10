package praticse;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utlity.ss;

public class prt extends ss {

	public static void main(String[] args) throws Exception, SocketException {

		String expected_url = "https://demowebshop.tricentis.com/";
 
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.className("ico-login")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("sdft@gmail.com");
		
		Thread.sleep(2000);

		driver.findElement(By.id("Password")).sendKeys("sdf@1235");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".button-1.login-button")).click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String act_url = driver.getCurrentUrl();

		if (expected_url.equals(act_url)) {
			System.out.println("Login sucessfully");
		} else {
		
			String filename = ss.dynamicNameWithDateAndTime("Login");
			ss.takeWebPageScreenshot(driver, "C:\\Users\\rupes\\git\\repository\\com.crm.seleniumM8\\src\\praticse\\kj" + filename + ".png");
			driver.close();
			throw new Exception("This is exception");
			
		}
		

		driver.close();  

	}

}
