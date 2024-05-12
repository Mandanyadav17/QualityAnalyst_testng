package corejavabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class backicon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://app.nextgenerationclean.com/login");
		driver.navigate().to("https://www.google.com/maps");
		Thread.sleep(200);
		driver.navigate().back();
		driver.navigate().forward();


	}

}
