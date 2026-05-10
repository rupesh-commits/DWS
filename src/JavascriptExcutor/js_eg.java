package JavascriptExcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class js_eg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(2000);

		// Down casting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");
		
		//Thread.sleep(2000);
		
		// js.executeScript("window.scrollBy(0,-1000)")

		//Thread.sleep(2000);

		// ScrollTo
		js.executeScript("window.scrollTo(0,1000)");

		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollTo(0,-1000)");

	}
}
