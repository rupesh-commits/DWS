package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByCordinates {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		Actions action1 = new Actions(driver);

		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		action1.scrollByAmount(0,750).perform();
		//facebook.click();
	}
}
