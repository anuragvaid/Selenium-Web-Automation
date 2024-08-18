package browserstack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demoqa {
	public static void main(String[] args) { 
		System.out.println("Demo QA form");
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			
			Actions actions=new Actions(driver);
			
			WebElement firstName=driver.findElement(By.id("firstName"));
			firstName.sendKeys("Anurag");
			
			WebElement lastName=driver.findElement(By.id("lastName"));
			lastName.sendKeys("Vaid");
			
			WebElement email=driver.findElement(By.id("userEmail"));
			email.sendKeys("anuragvaid28novem@gmail.com");
			
			WebElement gender=driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
			gender.click();
			
			WebElement mobile=driver.findElement(By.id("userNumber"));
			mobile.sendKeys("1234567890");
			
			WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
	        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", dateOfBirthInput);
	        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
	        Select monthSelect = new Select(monthDropdown);
	        monthSelect.selectByVisibleText("October");

			WebElement yearDropdown=driver.findElement(By.className("react-datepicker__year-select"));
			Select selectYear=new Select(yearDropdown);
			selectYear.selectByVisibleText("2002");
			
			WebElement day=driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day')and text()='28']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",day);
			
			WebElement subjectInput = driver.findElement(By.cssSelector(".subjects-auto-complete__input input"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", subjectInput);

            subjectInput.sendKeys("Physics");
            Thread.sleep(3000);
            subjectInput.sendKeys(Keys.TAB); // Ensure to trigger the selection


            subjectInput.sendKeys("English");
            Thread.sleep(3000);
            subjectInput.sendKeys(Keys.TAB);// Ensure to trigger the selection

            subjectInput.sendKeys("Computer Science");
            Thread.sleep(3000);
            subjectInput.sendKeys(Keys.TAB); // Ensure to trigger the selection


	
			WebElement hobbies1=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",hobbies1);
			WebElement hobbies2=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",hobbies2);
			WebElement hobbies3=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",hobbies3);
			
			
			WebElement uploadPicture=driver.findElement(By.id("uploadPicture"));
			uploadPicture.sendKeys("C:\\Screenshot (106).png");
			
			
			WebElement currentAddress=driver.findElement(By.id("currentAddress"));
			currentAddress.sendKeys("123 jalandhar");
			
			WebElement ele=driver.findElement(By.id("react-select-3-input"));
			ele.sendKeys("Haryana");
			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-3-option']")));
			WebElement suggestions=driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",suggestions);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",suggestions);
			
			WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Panipat");
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-4-option'")));
            WebElement suggestions2 = driver.findElement(By.xpath("//div[@id='react-select-4-option-1']"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",suggestions2);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",suggestions2);
		
			WebElement submitButton = driver.findElement(By.id("submit"));
			submitButton.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
		}
		catch (Exception e){
			e.printStackTrace();
			driver.quit();
		}
	}		
}
