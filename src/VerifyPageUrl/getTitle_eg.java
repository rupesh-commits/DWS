package VerifyPageUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_eg {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		//

		driver.manage().window().maximize();

		Thread.sleep(2000);

		String actual_title = "Demo Web Shop";

		String expected_title = driver.getTitle();

		if (actual_title.equals(expected_title)) {
			System.out.println("Title is same");
		} else {
			driver.close();
			throw new Exception("Title is diff");

		}

		driver.close();
	}

}
