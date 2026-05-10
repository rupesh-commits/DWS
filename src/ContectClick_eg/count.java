package ContectClick_eg;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class count {
	
	public static void main(String[] args) throws InterruptedException,SocketException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		int SeWeb=0;
		int testYantra=0;
		int selenium=0;
		
		Actions act=new Actions(driver);
		for(int i=1;i<=9;i++) {
			Thread.sleep(2000);
			
			WebElement source = driver.findElement(By.id("node"));
			WebElement mongo = driver.findElement(By.id("mongo"));
			WebElement angular = driver.findElement(By.id("angular"));
			WebElement target = driver.findElement(By.id("droparea"));
	        int random=(int)(Math.random()*3);
	        
	        
	        if(random==0) {
	        	act.dragAndDrop(source, target).perform();
	        	SeWeb++;
	        }
	        else if(random==1){
	        	act.dragAndDrop(mongo, target).perform();
	        	testYantra++;    	
	        }
	        else {
	        	act.dragAndDrop(angular, target).perform();
	        	selenium++;
	        }
		}
		System.out.println("node = " + SeWeb);
		System.out.println("mongo = " + testYantra);
		System.out.println("angular = " + selenium);
		
		driver.close();
	}

}
