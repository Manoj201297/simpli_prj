package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class negtest {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// navigate to the application
		driver.get("https://www.facebook.com/");
		// enter invalid username and password
		driver.findElementById("email").sendkeys("wolve@gmail.com");
		driver.findElementById("pass").sendkeys("123man");
		
	}
	
	
}
	

}
