package corejavabasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Additemsincart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getText());
			String name = products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
			}
			}
		}
		
		}
		

	


