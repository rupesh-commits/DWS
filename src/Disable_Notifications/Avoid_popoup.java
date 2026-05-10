package Disable_Notifications;

import org.openqa.selenium.chrome.ChromeDriver;

public class Avoid_popoup {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		// to avoid login cred we have give in link : user: pwd @ remaing link
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}

}
