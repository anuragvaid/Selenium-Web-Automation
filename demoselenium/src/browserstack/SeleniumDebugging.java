package browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumDebugging
{
	@Test
    public void sample0()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement link = driver.findElement(By.linkText("Downloads"));
            link.click();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void sample()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement link = driver.findElement(By.linkText("Projects"));
            link.click();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void sample2()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement link = driver.findElement(By.linkText("Documentation"));
            link.click();
            Thread.sleep(2000);
        }

        catch (Exception e)
        {
            e.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void sample3()
    {
        // Set up the WebDriver and open the browser
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement link = driver.findElement(By.linkText("Documentation"));
            link.click();

            WebElement search1 = driver.findElement(By.className("DocSearch-Button-Placeholder"));
            search1.click();
            WebElement search2 = driver.findElement(By.className("DocSearch-Input"));
            search2.sendKeys("Selenium IDE");
            search2.click();
            Actions builder = new Actions(driver);
            builder.moveToElement(search2).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
            Thread.sleep(2000);

        }

        catch (Exception e)
        {
            e.printStackTrace();
            driver.quit();
        }
    }
}
