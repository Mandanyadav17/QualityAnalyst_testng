package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_clean extends Base {

    @Test(priority=4)
    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.clear();
        emailField.sendKeys("jorge@nextgenerationclean.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.clear();
        pass.sendKeys("Michocan87!");

        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        System.out.println("4");
    }

    @Test(priority=2)
    public void loginwithinvalidemail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.clear();
        emailField.sendKeys("jorge@nextgenerationclean.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.clear();
        pass.sendKeys("Michoacan87!");

        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        System.out.println("2");

        // Assert error message
        WebElement errorMessage = null;
        try {
            errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
            Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for invalid login attempt");
        } catch (Exception e) {
            Assert.fail("Error message should be displayed for invalid login attempt");
        }
    }

    @Test(priority=3)
    public void loginWithInavlidPass() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.clear();
        emailField.sendKeys("jorge@nextgenerationclean.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.clear();
        pass.sendKeys("Michoacan87!"); // Corrected typo

        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        System.out.println("3");

        // Assert error message
        WebElement errorMessage = null;
        try {
            errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
            Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for invalid login attempt");
        } catch (Exception e) {
            Assert.fail("Error message should be displayed for invalid login attempt");
        }
    }

    @Test(priority=1)
    public void loginWithInavalidCred() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.clear();
        emailField.sendKeys("jorge@nextgenerationclean.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.clear();
        pass.sendKeys("Mioacan87!"); // Corrected typo

        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        System.out.println("1");

        // Assert error message
        WebElement errorMessage = null;
        try {
            errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
            Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for invalid login attempt");
        } catch (Exception e) {
            Assert.fail("Error message should be displayed for invalid login attempt");
        }
    }
}
