package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disbale_Calender {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	
	Thread.sleep(2000);
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
     WebElement diable_calendar = driver.findElement(By.id("datepicker1"));
     js.executeScript("arguments[0].value='04/05/2026'", diable_calendar);
     
	
	}

}
