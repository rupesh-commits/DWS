package Actions;

import java.net.http.WebSocket;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/rupes/Downloads/demo%20(2).html");

		WebElement dropdown = driver.findElement(By.id("multiple_cars"));
		int i = 0;
		Select select = new Select(dropdown);

		List<WebElement> dp = select.getOptions();

		for (WebElement webElement : dp) {
			select.selectByIndex(i++);
			System.out.println(dp);
			Thread.sleep(2000);
		}

	}

}
