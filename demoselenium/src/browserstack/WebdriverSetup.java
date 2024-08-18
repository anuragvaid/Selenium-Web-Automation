package browserstack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebdriverSetup {
	public static void main(String[] args) {
		System.out.println("Test");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		driver1.quit();
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-win64\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");
		driver2.manage().window().maximize();
		driver2.quit();
	}
}
