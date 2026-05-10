package DWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		
		WebElement click__login = driver.findElement(By.className("ico-login"));
		click__login.click();
		
		Thread.sleep(3000);
		
		WebElement login  = driver.findElement(By.id("Email"));
		login.sendKeys("sahanerupesh73@gmail.com");
		
		
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.className("password"));
		Password.sendKeys("Abcd@1234");
		
		Thread.sleep(3000);
		
		WebElement tick = driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
		tick.click();
		
		Thread.sleep(3000);
		
		WebElement login_button = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		login_button.click();
		

		driver.close();
		
		System.out.println("Login Now Automate Sucessfully");
		
	}
}
