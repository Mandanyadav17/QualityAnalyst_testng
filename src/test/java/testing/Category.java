package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Category extends Login_clean {

    @Test(priority=1)
    public void category() {
    	login();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase wait time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Category Management']")));

        System.out.println("category");
        driver.findElement(By.xpath("//li[normalize-space()='Category Management']")).click();
    }

    @Test(priority=2)
    public void Addcategory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase wait time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg'])[20]")));

        System.out.println("addcategory");
        driver.findElement(By.xpath("(//*[local-name()='svg'])[20]")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20)); // Reduce wait time for subsequent elements
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"flex-col medium-gap\"]/label")));
        driver.findElement(By.xpath("//div[@class=\"flex-col medium-gap\"]/label")).click();

        driver.findElement(By.xpath("//input[@placeholder=\"Enter category name\"]"))
              .sendKeys("painting");

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20)); // Reduce wait time for subsequent elements
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]")));

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    
    @Test(priority=3)
    public void getdata() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase wait time
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='subtle-font text-center']")));

            List<WebElement> categoryElements = driver.findElements(By.xpath("//h3[@class='subtle-font text-center']"));
            System.out.println("Found " + categoryElements.size() + " categories");

            for (WebElement element : categoryElements) {
                String categoryName = element.getText();
                System.out.println("Category Name: " + categoryName);

                if (categoryName.contains("Carpet Cleaning")) {
                    try {
                        Actions actions = new Actions(driver);
                        actions.moveToElement(element).click().perform();
                    } catch (ElementClickInterceptedException e) {
                        // Handle the exception if the element is not clickable due to an overlay
                        System.err.println("Element is not clickable due to an overlay. Waiting for overlay to disappear...");
                        WebDriverWait overlayWait = new WebDriverWait(driver, Duration.ofSeconds(10));
                        overlayWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root")));

                        // Retry clicking on the element
                        Actions actions = new Actions(driver);
                        actions.moveToElement(element).click().perform();
                    }
                    break; // Exit the loop after clicking on the "Cleaning" category
                }
            }
        } catch (NoSuchElementException e) {
            System.err.println("Element not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase wait time
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add Service']")));
        driver.findElement(By.xpath("//button[normalize-space()='Add Service']")).click();

        try {
            WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"Enter service name\"]"));
            inputField.sendKeys("Floor cleaning");
        } catch (NoSuchElementException e) {
            System.err.println("Input field not found.");
            e.printStackTrace();
        }

        try {
            WebElement inputField1 = driver.findElement(By.xpath("//input[@placeholder=\"Enter price\"]"));
            inputField1.sendKeys("3");
        } catch (NoSuchElementException e1) {
            System.err.println("Input field not found.");
            e1.printStackTrace();
        }

        driver.findElement(By.xpath("//textarea[@placeholder=\"Describe your services\"]"))
              .sendKeys("Painting cleaning");
        driver.findElement(By.xpath("//input[@placeholder=\"What does it include?\"]"))
              .sendKeys("detergents");

        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform();

        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"flex-row small-gap align-center\"]/input")));

        driver.findElement(By.xpath("//div[@class=\"flex-row small-gap align-center\"]/input"))
              .click();

        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Add')])[2]")));

        driver.findElement(By.xpath("(//button[contains(text(),'Add')])[2]")).click();
    }
}
