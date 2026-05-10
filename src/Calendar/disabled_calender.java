package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled_calender {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.id("datepicker1")).click();;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@data-month='3']/a[text()='21']")).click();
		
		
		
		
		
		

	}

}
