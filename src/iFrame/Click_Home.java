package iFrame;

import java.net.http.WebSocket;

import org.bouncycastle.asn1.x509.Holder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Click_Home {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ram");
		
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		
		
		Thread.sleep(1000);

		WebElement home_btn = driver.findElement(By.partialLinkText("Home"));
		home_btn.click();

	}

}
