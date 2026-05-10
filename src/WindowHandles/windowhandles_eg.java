package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandles_eg {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		
		String parentPage = driver.getWindowHandle();
		
		System.out.println(parentPage);
		
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(facebook).perform();
		
		Thread.sleep(2000);
		
		facebook.click();
		
		Thread.sleep(2000);
		 
		Set<String> child1 = driver.getWindowHandles();
		
		
		for (String str : child1) {
			driver.switchTo().window(str);
			//System.out.println(driver.switchTo().window(str));
		}
		
		driver.findElement(By.xpath("//input[contains(@id,'_r_')]")).sendKeys("12341234");
		
		
	}
	

}
