package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Scheduler extends Login {
    
    @Test(priority=1)
    public void navigatetoscheduler() throws InterruptedException {
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase wait time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Scheduler']")));
        
        driver.findElement(By.xpath("//li[normalize-space()='Scheduler']")).click();
    
   
       driver.findElement(By.xpath("//button[@class=\"Button_customButton__kbzbG\"]")).click();
       driver.findElement(By.xpath("//input[@placeholder=\"Enter market name\"]")).sendKeys("India_new");
       driver.findElement(By.xpath("//input[@name=\"groupName\"]")).sendKeys("carpet cleaning");
       
       // Click on some element
    WebElement dropdwon=  driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]"));
      dropdwon.click();
      Thread.sleep(5000);
      WebElement ele = driver.findElement(By.xpath("//input[contains(@id,'react-select')]"));
      ele.sendKeys("Carpet Cleaning");
      Thread.sleep(5000);
      ele.sendKeys(Keys.ENTER);
      Thread.sleep(5000);
       
     List<WebElement> staff = driver.findElements(By.xpath("//div[@class=\"flex-row align-center gap-6\"]"));
    System.out.println("Found " + staff.size() + " staff");
     for (WebElement elementname :staff ) {
         String staffs = elementname.getText();
        System.out.println("Staff name : " + staffs);       
         
        if (staffs.contains("Huff")) {
      	 
       	 driver.findElement(By.xpath("//button[@class=\"Button_hover_grey__pVwjZ Button_customButton__kbzbG\"]")).click();  

         }
         
         driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
     }
     
     
   }
  
    @Test(priority=2)
    public void editgropup() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	List<WebElement> Markets = driver.findElements(By.xpath("//div[@class=\"pointer\"]"));
    	 System.out.println("Found " + Markets.size() + " staff");
    	 for(WebElement MArketname: Markets) {
    		 String Marketdata= MArketname.getText();
    		 System.out.println("Staff name : " +Marketdata);
    		 
    		 if (Marketdata.contains("India_new")) {
    			 
    			Thread.sleep(3000);
            	 driver.findElement(By.xpath("//*[local-name()='svg' and @class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium pointer css-vubbuv\"]")).click();  

             }
    		 
//    		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increase wait time
//    	        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Edit Name')]")));
    		 
    	         driver.findElement(By.xpath("//li[contains(text(),'Edit Name')]")).click();
    	         System.out.println("edit");
    	          Thread.sleep(2000);
    	          
    	          WebElement cleardata=driver.findElement(By.xpath("//input[@class=\"Input_customInput__SkjPf\"]"));
    	          cleardata.clear();
    	          cleardata.sendKeys("newindiamarket");
    	          
    	          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	 }
    	 
    	 
    }
    
    
    
@Test(priority=3)
public void deletegrpup() throws InterruptedException {
	Thread.sleep(2000);
	List<WebElement> Markets = driver.findElements(By.xpath("//div[@class=\"pointer\"]"));
	 System.out.println("Found " + Markets.size() + " staff");
	 for(WebElement MArketname: Markets) {
		 String Marketdata= MArketname.getText();
		 System.out.println("Staff name : " +Marketdata);
		 
		 if (Marketdata.contains("newindiamarket")) {
			 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increase wait time
  	        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[local-name()='svg' and @class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium pointer css-vubbuv\"]")));
         	 
         	 driver.findElement(By.xpath("//*[local-name()='svg' and @class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium pointer css-vubbuv\"]")).click();  

          }
        	  
		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increase wait time
	        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Delete Market')]")));
	        System.out.println("delete");
	         driver.findElement(By.xpath("//li[contains(text(),'Delete Market')]")).click();
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	

}
}
}
    		 
 