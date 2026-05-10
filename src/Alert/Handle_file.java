package Alert;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_file {

	public static void main(String[] args) throws InterruptedException,SocketException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ilovepdf.com/word_to_pdf");

		Thread.sleep(2000);

		WebElement upload_Ele = driver.findElement(By.xpath("//input[@type='file']"));
		upload_Ele.sendKeys("C:\\Users\\rupes\\Downloads\\doc\\3mb.doc");

		WebElement convert  = driver.findElement(By.id("processTaskTextBtn"));
		convert.click();
		
		System.out.println("File uplpoading done");
		
	
	}
}
