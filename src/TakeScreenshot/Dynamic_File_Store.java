package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_File_Store {

	public static void main(String[] args) throws IOException {

		LocalDateTime dateTime = LocalDateTime.now();

		String dynamic = dateTime.toString().replaceAll(":", "-");

		String filename = "Dws_page" + dynamic;

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");

		//
		TakesScreenshot take_ss = (TakesScreenshot) driver;

		File src = take_ss.getScreenshotAs(OutputType.FILE);

		File desc = new File("C:\\Users\\rupes\\git\\repository\\com.crm.seleniumM8\\src\\TakeScreenshot\\Save_ss\\"
				+ filename + ".png");

		FileHandler.copy(src, desc);

	}

}
