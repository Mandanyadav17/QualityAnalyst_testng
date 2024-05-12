package corejavabasics;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addmultipleitemsatatime {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String[] listproduct = {"Cucumber","Tomato","Grapes"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getText());
			
			//gettingproduts 
			String[] name = products.get(i).getText().split("-");
			String formattedtext= name[0].trim();
			
			
			//arraylist
			System.out.println(Arrays.asList(listproduct));
			
			//convert array into arraylist 
			List itemsinarraylist = Arrays.asList(listproduct);
			
			System.out.println(itemsinarraylist.contains(formattedtext));
			
			
			
			if(itemsinarraylist.contains(formattedtext))
			{
				driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
				
			}
			}

	}

}
