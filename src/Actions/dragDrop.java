package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromiumDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Thread.sleep(2000);
		
		
		Actions action1 = new Actions(driver);
		
		WebElement logo1_source = driver.findElement(By.id("node"));
		WebElement drop_logo1 = driver.findElement(By.id("droparea"));
		action1.dragAndDrop(logo1_source, drop_logo1).perform();
		
		Thread.sleep(2000);
		
		WebElement logo1_source2 = driver.findElement(By.id("mongo"));
		action1.dragAndDrop(logo1_source2, drop_logo1).perform();
		
		
		Thread.sleep(2000);
		//angular
		
		WebElement logo1_source3 = driver.findElement(By.id("angular"));
		action1.dragAndDrop(logo1_source3, drop_logo1).perform();
		
		
		
		/// click and Hold
		action1.clickAndHold(logo1_source3).release(drop_logo1).perform();
	}

}
