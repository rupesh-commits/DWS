package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forEacheg {
	public static void main(String[] args) throws InterruptedException {
		

	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
    driver.get("https://demowebshop.tricentis.com/");
    
    Thread.sleep(2000);
    
    
    List<WebElement>poll = driver.findElements(By.name("pollanswers-1")); 
    
    for (WebElement web: poll) {
		web.click();
		Thread.sleep(2000);
	}
    
    
    //=================Traverse from parent to child ==========================
    
    System.out.println("Secound Way");

    List<WebElement> poll1 = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
    for (WebElement web1 : poll1) {
		web1.click();
		Thread.sleep(1000);
	}

    
	}
}
