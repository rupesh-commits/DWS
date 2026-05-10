package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class open_NEW_TAB {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		
		WebElement Bokks = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		act.keyDown(Keys.CONTROL).click(Bokks).perform();
		
		System.out.println("Done");
	}

}
