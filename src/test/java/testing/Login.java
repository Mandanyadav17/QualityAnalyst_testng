package testing;

import org.openqa.selenium.By;


import org.testng.annotations.Test;

public class Login extends Base {
	
	
	 @Test
	public void login() {
       System.out.println("Login");
       
       driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jorge@nextgenerationclean.com");
       driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Michocan87!");
       driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }

}
