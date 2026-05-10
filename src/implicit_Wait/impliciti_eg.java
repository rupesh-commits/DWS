package implicit_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class impliciti_eg {

	public static void main(String[] args) {
		
		ChromiumDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// method :1
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
//
 
// method: 2
			WebElement create_acc_btn = driver.findElement(By.xpath("//span[text()='Create Account']"));
		create_acc_btn.click();
	}
}
