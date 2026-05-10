package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_withoutweb_element {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		act.sendKeys("Computer").perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.ARROW_DOWN).perform();

		Thread.sleep(4000);
		act.sendKeys(Keys.ENTER).perform();

// for loop
//		for (int i = 0; i < 6; i++) {
//			act.sendKeys(Keys.TAB).perform();
//			Thread.sleep(2000);
//		}
//		act.sendKeys("Computer");
//
//		Thread.sleep(4000);
//
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//
//		Thread.sleep(4000);
//		act.sendKeys(Keys.ENTER).perform();

	}

}
