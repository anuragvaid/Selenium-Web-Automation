package browserstack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSite {
	public static void main(String[] args) {
		System.out.println("Google site Mouse and keyboard events");
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		try {
			//navigate through firefox webdriver		
			driver.navigate().to("https://www.google.com"); 
			//id of search box
			WebElement Search=driver.findElement(By.id("APjFqb")); 
			Search.sendKeys("Amazon");
			Thread.sleep(4000);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//Performing Keyboard actions (UP,DOWN)
			Actions actions=new Actions(driver);
			actions.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.UP).perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.UP).perform();
			Thread.sleep(2000); 
			
			//Performing Mouse Events(click)
			
			WebElement suggestionList=driver.findElement(By.className("erkvQe"));
			Thread.sleep(2000);
			//Select the first suggestion
			WebElement firstsuggestion=suggestionList.findElement(By.cssSelector("li:nth-child(1)"));
			Thread.sleep(2000);
			actions.moveToElement(firstsuggestion).click().perform();
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
	}

}
