package webElement;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_eg {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		// gettext() : return type is String 
		// use : print name on console   
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		String reg = register.getText();
		
		System.out.println(reg);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
