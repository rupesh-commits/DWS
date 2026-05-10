package DWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		
		Thread.sleep(3000);
		
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Rajesh");
		
		Thread.sleep(3000);
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("sahane");
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("sahanerajesh73@gmail.com");
	
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Abcd@1234");
	
		Thread.sleep(3000);
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Abcd@1234");
		
		Thread.sleep(3000);
		
		WebElement RegisterButton = driver.findElement(By.id("register-button"));
		RegisterButton.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("Register is Now Automate sucessfully");
		
	}

}
