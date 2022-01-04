package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_title {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// navigate to the application
		driver.get("https://www.facebook.com/");
		// verify user sees the title
		driver.findElement(By.id("email")).sendKeys("wolveman@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123man");
		driver.findElement(By.name("LogIn")).click();
		String expstr = "Invalid username or password";
		
		// close the browser
		driver.quit();
	}

}
