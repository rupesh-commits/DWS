package Actions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment21_04_26 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		act.dragAndDropBy(drag, 300,0).perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
