package Verify;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String exp_data = "Computer";

		Thread.sleep(2000);

		WebElement search_field = driver.findElement(By.id("small-serchterms"));
		search_field.sendKeys(exp_data);

		String act_data = search_field.getAttribute("value");

		if (exp_data.equals(act_data)) {
			System.out.println("Test case pass");
		} else {
			driver.close();
			throw new Exception("Test case fail");
		}
	}

}
