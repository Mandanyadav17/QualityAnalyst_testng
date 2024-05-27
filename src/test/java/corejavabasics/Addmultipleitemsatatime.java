package corejavabasics;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addmultipleitemsatatime  {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // List of products to add to cart
        String[] desiredProducts = {"Cucumber", "Tomato", "Grapes"};

        // Open the target website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        // Find all products displayed on the page
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        // Iterate through the products and add desired items to the cart
        for (int i = 0; i < products.size(); i++) {
            // Get the product name
            String productName = products.get(i).getText();
            System.out.println("Product name foundt: " + String.join(",", productName));
            
            // Split the product name to get the actual product name
            String[] productNameParts = productName.split("-");
            if (productNameParts.length > 0) {
                String formattedText = productNameParts[0].trim();
                System.out.println("Formatted product name: " + String.join(",", formattedText));

                // Convert array to list for easy comparison
                List<String> productList = Arrays.asList(desiredProducts);

                // Check if the product is in the list of desired products
                if (productList.contains(formattedText)) {
                    System.out.println("Product matched: " + formattedText);
                    // Click on "Add to cart" button for the matching product
                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                }
            } else {
            	System.out.println("Product in cart: " + String.join(",", productName));
            }
        }

        // Wait for the cart icon to be visible and click on it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cart-icon']")));
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

        // Wait for the "PROCEED TO CHECKOUT" button to be visible and click on it
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")));
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        List<WebElement> cartItems = driver.findElements(By.xpath("//p[@class='product-name']"));
        List<String> cartProductNames = new ArrayList<>();
        for (WebElement cartItem : cartItems) {
            String cartItemName = cartItem.getText().trim();
            if (!cartItemName.isEmpty()) {
                // Split the product name to get the actual product name
                String[] cartItemNameParts = cartItemName.split("-");
                if (cartItemNameParts.length > 0) {
                    String formattedCartItemName = cartItemNameParts[0].trim();
                    System.out.println("Product in cart: " + formattedCartItemName);
                    cartProductNames.add(formattedCartItemName);
                } else {
                    System.out.println("Empty product name found, skipping...");
                }
            } else {
                System.out.println("Empty product name found, skipping...");
            }
        }
        
        List<String> cartItemNames = Arrays.asList(desiredProducts);
        if (cartProductNames.containsAll(cartItemNames) && cartItemNames.containsAll(cartProductNames)) {
            System.out.println("All items added to the cart are present in the cart.");
        } else {
            System.out.println("There are discrepancies between items added to the cart and items in the cart.");
        }
        
        // Close the browser
        
    }
}