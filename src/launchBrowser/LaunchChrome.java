package launchBrowser;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Selenium\\Selenium_Eclipse\\Class1\\driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Selenium");

		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");

		Thread.sleep(3000);
		driver.close();

		
		
		// http://www.techfios.com/billing/?ng=admin/
		// demo@techfios.com
		// abc123
	}

}
