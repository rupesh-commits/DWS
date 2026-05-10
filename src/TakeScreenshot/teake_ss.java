package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class teake_ss {
	
	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// 
		TakesScreenshot take_ss = (TakesScreenshot) driver;
		
		File src = take_ss.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("C:\\Users\\rupes\\git\\repository\\com.crm.seleniumM8\\src\\TakeScreenshot\\Save_ss\\DWS_Home.png");
		
        FileHandler.copy(src,desc);

		
	}

}
