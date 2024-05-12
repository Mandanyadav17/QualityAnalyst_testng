package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://app.magictask.io/create-account");
		driver.findElement(By.xpath("//input[@placeholder=\"Your full name\"]")).sendKeys("Nick Johnas");
		driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys("nick@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"btn-container-create-account-screen-submit-btn\"]")).click();

	}

}
