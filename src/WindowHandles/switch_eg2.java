package WindowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_eg2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		String parentPage = driver.getWindowHandle();
		System.out.println("Parent: " + parentPage);

		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

		// Click all links that open new tabs
		for (WebElement web : links) {
			web.click();
			Thread.sleep(500);
		}

		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {

			driver.switchTo().window(window);

			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

			// Check if it's YouTube
			if (currentUrl.contains("youtube")) {
				Thread.sleep(1000);
				driver.findElement(By.name("search_query")).sendKeys("MrBeast");
				break; // stop once found
			}
		}

		// Optional: switch back to parent
		driver.switchTo().window(parentPage);
	}

}
