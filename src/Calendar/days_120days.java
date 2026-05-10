package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class days_120days {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt  =  new ChromeOptions();
		opt.addArguments("disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("dvfarecal")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("fiv_2_28/04/2026")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("divRtnCal")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("img2Nex")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("img2Nex")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("img2Nex")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("fiv_2_28/08/2026")).click();
	    
	    
	    
	    
		
		
	}

}
