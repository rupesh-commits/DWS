package select_dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verif_digit_download {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");

		// Verify page
		WebElement heading = driver.findElement(By.xpath("//strong[text()='Digital downloads']"));

		if (heading.isDisplayed()) {
			System.out.println("Digital Downloads page verified");
		}

		// Step 1: Get all option text
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='products-orderby']/option"));
		for(int i=0;i<options.size();i++)
		{
			WebElement option_dropdown =   driver.findElement(By.id("products-orderby"));
			
			Select sel1 = new Select(option_dropdown);
			
			sel1.selectByIndex(1);
			Thread.sleep(2000);
		}
		
		

	}

}
