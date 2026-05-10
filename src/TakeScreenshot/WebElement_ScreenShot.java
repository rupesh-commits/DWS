package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Optimized.web;

public class WebElement_ScreenShot {

	public static void main(String[] args) throws IOException {

		LocalDateTime datetime = LocalDateTime.now();

		String dynamic = datetime.toString().replaceAll(":", "-");

		System.out.println(dynamic);

		String filename = "dwsIcon" + dynamic;

		System.out.println(filename);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");

		//
		WebElement demoicon = driver.findElement(By.xpath("//div[@class,'header-logo']"));

		File src = demoicon.getScreenshotAs(OutputType.FILE);

		File desc = new File("./Save_ss/" + filename + ".png");

		FileHandler.copy(src, desc);

	}

}
