package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Base {

    public static WebDriver driver;
    
    @BeforeSuite
    public static void driversSetup() {
        try {
            
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.nextgenerationclean.com/login");
            String pageTitle = driver.getTitle();
            System.out.println("The current page title is: " + pageTitle);
        } catch (Exception e) {
            System.err.println("Failed to initialize WebDriver: " + e.getMessage());
        }
    }
    
   
  

    @AfterSuite
    public void tearDown() {
            driver.quit();
        }
    }

