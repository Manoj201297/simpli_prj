package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class newdemo {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementByXpath("(input[contains(@name,'email'))");
		driver.quit();
	}

}
