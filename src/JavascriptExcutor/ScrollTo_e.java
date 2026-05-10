package JavascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_e {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.xpath("//button[@class='dropbtn']"));

		// Element will show at top

		// driver.executeScript("arguments[0].scrollIntoView(true)", drop);

		Thread.sleep(2000);

		// Element will show at bottom
		driver.executeScript("arguments[0].scrollIntoView(false)", drop);

	}

}
