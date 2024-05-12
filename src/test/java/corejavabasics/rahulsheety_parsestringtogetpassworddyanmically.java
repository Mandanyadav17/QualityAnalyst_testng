package corejavabasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulsheety_parsestringtogetpassworddyanmically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String name="rahul";
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    String password= getpassword(driver);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	//driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[@class=\"logout-btn\"]")).click();

		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();
		//System.out.println(textget.split("'"));
		String[] arrayobj=passwordtext.split("'");
		String passwordindex1= arrayobj[1].split("'")[0];
		return passwordindex1;
		
		
	}
	}


