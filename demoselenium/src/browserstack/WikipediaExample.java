package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WikipediaExample {
	public static void main(String[] args) {
		System.out.println("Wikipedia");
        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
            // Navigate to the Wikipedia homepage
            driver.get("https://www.wikipedia.org");
            
            
            //Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Find all language links by their specific CSS selector
            List<WebElement> languageLinks = driver.findElements(By.cssSelector(".central-featured-lang a"));

            // Iterate through each language link
            for (int i = 0; i < languageLinks.size(); i++) {
                try {
                    // Re-fetch the language links to avoid stale element references
                    languageLinks = driver.findElements(By.cssSelector(".central-featured-lang a"));

                    WebElement link = languageLinks.get(i);

                    // Get the href attribute of the link
                    String url = link.getAttribute("href");

                    if (url != null && !url.isEmpty()) {
                        // Print the URL
                        System.out.println("Language Link: " + url);

                        link.click();

                        Thread.sleep(2000);

                        // Navigate back to the homepage
                        driver.navigate().back();

                        // Re-fetch the language links after navigation
                        languageLinks = driver.findElements(By.cssSelector(".central-featured-lang a"));

                        // Ensure the iteration index is valid
                        i = Math.min(i, languageLinks.size() - 1);
                    }
                } catch (Exception e) {
                    System.out.println("Could not click link or navigate back: " + e.getMessage());
                }
            }
            WebElement searchInput = driver.findElement(By.id("searchInput"));
            if (searchInput != null) {
                // Type a search query into the search bar
                searchInput.sendKeys("Selenium WebDriver");
                
                // Enter
                searchInput.sendKeys(Keys.RETURN);
                
                Thread.sleep(4000);

                // Navigate back to the homepage
                driver.navigate().back();
            
            }
           }
		catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

        
    }
}