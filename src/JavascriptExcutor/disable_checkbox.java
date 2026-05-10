package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Optimized.web;

public class disable_checkbox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.oracle.com/in/java/technologies/downloads");
		;

		Thread.sleep(2000);

		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.19_linux-x64_bin.rpm"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", jdk);

		jdk.click();

		Thread.sleep(2000);

		WebElement disable_element = driver.findElement(By.linkText("Download jdk-17.0.19_linux-x64_bin.rpm"));
		js.executeScript("arguments[0].click();", disable_element);

	}
}
