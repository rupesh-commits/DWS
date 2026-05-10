package Verify;

import java.time.Duration;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class isDisplaye_ele {
	
	public static void main(String[] args) throws Exception {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement gez = driver.findElement(By.xpath("//a[@data-group='genz']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(gez).perform();
		
		WebElement tshirt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-rectid='874' and text()='Tshirts under ₹299']")));
		tshirt.click();
		
		if(tshirt.isDisplayed())
		{
			System.out.println("Pass");
		}
		else
		{
			driver.close();
			throw new Exception("test fail");
		}
	}

}
