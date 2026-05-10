package select_dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_DDp {
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

		List<String> optionTexts = new ArrayList<>();

		for (WebElement ele : options) {
			optionTexts.add(ele.getText());
		}

		// Step 2: Loop using for-each (safe)
		for (String text : optionTexts) {

			WebElement dropdown = driver.findElement(By.id("products-orderby"));
			dropdown.click();
			Select sel = new Select(dropdown);

			sel.selectByVisibleText(text);

			Thread.sleep(2000); // wait for reload
		}

		// driver.quit();
	}

}
