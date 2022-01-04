package Search_amazon;

import java.sql.DriverManager;
import java.sql.Statement;
import java.io.File;
import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazonsearch {
	private static Connection con;
	private static Statement stmt;
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		// open the browser
		driver = new ChromeDriver();
				
		// navigate to the application
		driver.get("https://www.amazon.in/gp/help/customer/display.html?nodeId=201909210");
		// verify user sees the title
		String actstr = driver.getTitle();
		String expstr = "Amazon.in Help: Content guidelines";
		String a = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).getText();
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		String b = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).getText();
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		if (expstr.equals(actstr)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		System.out.println(a);
		System.out.println(b);
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/amazon";
			String username = "root";
			String password = "root";
			String query = "INSERT INTO Amazon VALUE(1,\"Electronics\",\"Mobile\");";
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// close the browser
		driver.quit();
	}

}
