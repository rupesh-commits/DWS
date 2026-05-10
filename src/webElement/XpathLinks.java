package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class XpathLinks {

	public static void main(String[] args) throws InterruptedException {

		ChromiumDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		for(int i=0;i<4;i++)
		{
	      List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']//a"));
	
	       links.get(i).click();
			Thread.sleep(2000);
			//driver.navigate().back();
			//Thread.sleep(1000);

	}
}
}