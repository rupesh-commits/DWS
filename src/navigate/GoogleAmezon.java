package navigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAmezon {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver cobj = new ChromeDriver();
		
		cobj.manage().window().maximize();
		
		cobj.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		cobj.navigate().to("https://www.flipkart.com/");
		
		 
		cobj.navigate().forward();
		Thread.sleep(3000);
		
		cobj.navigate().refresh();
		
		Thread.sleep(3000);
		
		cobj.navigate().back();
		
		Thread.sleep(3000);
		
		cobj.close();
		
	}

}
