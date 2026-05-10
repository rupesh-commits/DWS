package ContectClick_eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		Actions action = new Actions(driver);
		WebElement rt_btn = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rt_btn).perform();
		
		WebElement copy_btn = driver.findElement(By.xpath("//span[text()='Copy']"));
		action.click(copy_btn).perform();
		
		Thread.sleep(5000);

		WebElement rt_btn1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rt_btn1).click(copy_btn).perform();
		
		Thread.sleep(5000);
		
		

	}

}
