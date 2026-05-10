package Calendar;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_script120_Days {

	public static void main(String[] args) throws InterruptedException {

		LocalDate date = LocalDate.now();

		LocalDate afterdate = date.plusDays(120);

		// formati a date

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String todays_Date = date.format(formatter);
		String plus_date = afterdate.format(formatter);

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(2000);

		driver.findElement(By.id("dvfarecal")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[contains(@id,'" + todays_Date + "')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);

		for (;;) {
			List<WebElement> returndate = driver.findElements(By.xpath("//li[contains(@id,'" + plus_date + "')]"));
			if (returndate.isEmpty()) {
				driver.findElement(By.id("img2Nex")).click();
			} else {
				returndate.get(0).click();
				break;
			}
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.close();

	}

}
