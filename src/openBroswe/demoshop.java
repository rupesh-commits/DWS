package openBroswe;

import java.sql.DriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoshop {
	
	public static void main(String[] args) {
		
		
		// open breoswer
		ChromeDriver driver = new ChromeDriver();
		
		
		// max broswer
		driver.manage().window().maximize();
		
		// enter into website
		driver.get("https://demowebshop.tricentis.com/");
		
		// close browser
		
		driver.close(); 
		
		
		// Opening another page
	
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window();
		driver1.get("https://www.flipkart.com/");
		driver1.close();
	}
}
