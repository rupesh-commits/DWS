package Verify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSeletecdE {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement excellent_btn = driver.findElement(By.id("pollanswers-1"));
		//excellent_btn.click();

		if (excellent_btn.isSelected()) {
			System.out.println("Pass");
		} else {
			driver.close();
			throw new Exception("Test case fail");

		}
		Thread.sleep(2000);

		driver.close();
	}

}
