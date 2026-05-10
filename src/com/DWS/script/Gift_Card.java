package com.DWS.script;

import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gift_Card {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demowebshop.tricentis.com/");

		WebElement login_click = driver.findElement(By.className("ico-login"));
		login_click.click();

		WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("asflk@gmail.com");

		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.sendKeys("Abcd@1234");

		WebElement tick = driver.findElement(By.id("RememberMe"));
		tick.click();

		WebElement login = driver.findElement(By.cssSelector(".button-1.login-button"));
		login.click();
		// Add a product

		WebElement addGift = driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button"));
		addGift.click();

		Thread.sleep(2000);

		WebElement recipientname = driver.findElement(By.cssSelector(".recipient-name"));
		recipientname.sendKeys("Abcd");

		Thread.sleep(2000);

		WebElement recipientemail = driver.findElement(By.cssSelector(".recipient-email"));
		recipientemail.sendKeys("Abcd@gmail.com");
		Thread.sleep(2000);

//		WebElement your_name = driver.findElement(By.id("sender-name"));
//		your_name.sendKeys("Rupesh");

		Thread.sleep(2000);



		WebElement message = driver.findElement(By.className("message"));
		message.sendKeys("This is dummy message");

		Thread.sleep(2000);

		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.sendKeys(Keys.CONTROL+ "a");
		qty.sendKeys(Keys.DELETE);
		qty.sendKeys("2");
		
		Thread.sleep(2000);

		// add-to-cart-button-2

		WebElement Addbutton = driver.findElement(By.id("add-to-cart-button-2"));
		Addbutton.click();

		
		WebElement link3 = driver.findElement(By.className("ico-cart"));
    	link3.click();
		
		WebElement gifttick = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input"));
		gifttick.click();
		
		WebElement updatebutton = driver.findElement(By.cssSelector(".button-2.update-cart-button"));
		updatebutton.click();
	
		
		WebElement logout = driver.findElement(By.className("ico-logout"));
		logout.click();

		Thread.sleep(2000);

		driver.close();

	}

}
