package WindowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switch_eg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		String parentPage = driver.getWindowHandle();

		System.out.println(parentPage);

		
		String youtube_url = "https://www.youtube.com/user/nopCommerce";
		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

		for (WebElement web : links) {
			web.click();
			System.out.println();
			Thread.sleep(500);
		}

		Thread.sleep(2000);

		Set<String> childs_screen = driver.getWindowHandles();
		System.out.println(childs_screen);

		for (String str : childs_screen) {

			driver.switchTo().window(str);
		

			String actural_url = driver.getCurrentUrl();
			System.out.println(actural_url);
			
			
			if (actural_url.equals(youtube_url)) {
				Thread.sleep(2000);
				driver.findElement(By.name("search_query")).sendKeys("MrBeast");
                              
			}

			Thread.sleep(2000);

		}}}
	
