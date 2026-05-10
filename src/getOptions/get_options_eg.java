package getOptions;

import java.nio.channels.SelectableChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Optimized.web;

public class get_options_eg {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/rupes/Downloads/demo%20(2).html");

	
		System.out.println("all ele is selected");
		
		
	System.out.println("==========================================================");

		WebElement cars = driver.findElement(By.id("standard_cars"));
		Select cars_option = new Select(cars);
		Thread.sleep(2000);
//		cars_option.selectByIndex(1);
		// cars_option.selectByVisibleText("Volvo"); //Volvo
		cars_option.selectByVisibleText("BMW");

		Thread.sleep(2000);

//		List<WebElement> options = cars_option.getOptions();
//	
//		for (WebElement web : options) {
//			System.out.println(web.getText());
//		}

		Thread.sleep(2000);

	}

}
