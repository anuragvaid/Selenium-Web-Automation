package browserstack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExampleWebsite {
    public static void main(String[] args) {
    	System.out.println("Example");
        // Set the path to the Firefox Driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");

        // Initialize the Firefox Driver
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to the example website
            driver.get("https://example.com");

            // Interact with elements using different locators

            // Locate an element by LinkText and click it
            WebElement elementByLink = driver.findElement(By.linkText("More information..."));
            elementByLink.click();
            Thread.sleep(2000);
            
         // Locate an element by LinkText and click it
            WebElement elementByLink2 = driver.findElement(By.linkText("Domains"));
            elementByLink2.click();
            Thread.sleep(2000);

            // Locate an element by id and click it (Root zone management)
            WebElement elementById= driver.findElement(By.id("nav_dom_root"));
            elementById.click();
            Thread.sleep(2000);
            
         // Locate an element by LinkText and click it
            WebElement elementByLink3 = driver.findElement(By.linkText("Domains"));
            elementByLink3.click();
            Thread.sleep(2000);
           
         // Locate an element by LinkText and click it
            WebElement elementByLink4 = driver.findElement(By.linkText("Protocols"));
            elementByLink4.click();
            Thread.sleep(2000);
            
         // Locate an element by LinkText and click it
            WebElement elementByLink5 = driver.findElement(By.linkText("Numbers"));
            elementByLink5.click();
            Thread.sleep(2000);
            
         // Locate an element by id and click it
            WebElement elementById1 = driver.findElement(By.id("nav_num_rir"));
            elementById1.click();
            Thread.sleep(2000);
            
         // Locate an element by LinkText and click it
            WebElement elementByLink6 = driver.findElement(By.linkText("About"));
            elementByLink6.click();
            Thread.sleep(2000);         

        } catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
            // Close the browser
        	driver.quit();
        }
    }
}
