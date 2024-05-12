package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Seleniumtest {
	
	public static WebDriver driver;

	@BeforeSuite

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.nextgenerationclean.com/login");

		driver.manage().window().maximize();
	}

	@AfterSuite
	public static void close() {
	driver.close();
	
	}
}
