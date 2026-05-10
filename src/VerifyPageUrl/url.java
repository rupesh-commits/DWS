package VerifyPageUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		String actual_url = "https://demowebshop.tricentis.co/";

		String expected_url = driver.getCurrentUrl();

		Thread.sleep(2000);

		if (actual_url.equals(expected_url)) {
			System.out.println("In in dws page");
		} else {
			driver.close();
			throw new Exception("I not dws page");
			
		}
		

		driver.close();

	}

}
