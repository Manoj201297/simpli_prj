package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class project {
	
	private static final By Byxpath = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		List <WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(links.size());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone x");
		//driver.findElement(By.xpath("//input[contains(@value,'go']")).click();
		driver.findElement(By.id("nav-submit-button")).click();
		driver.findElement(By.className("a-size-medium a-color-base a-text-normal")).click();
		driver.quit();
		
	}

}
