package browserstack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormsPagePOMTest {

    private WebDriver driver;
    private FormsPagePOM formsPage;

    @BeforeMethod
	@BeforeClass
    public void setUp() {
        System.out.println("Demo QA form(POM)");
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        formsPage = new FormsPagePOM(driver);
    }

    @Test
    public void testFormSubmission() throws InterruptedException {
        formsPage.enterFirstName("Anurag");
        formsPage.enterLastName("Vaid");
        formsPage.enterEmail("anuragvaid28novem@gmail.com");
        formsPage.selectGender();
        formsPage.enterMobile("1234567890");
        formsPage.selectDateOfBirth("October", "2002", "28");
        formsPage.selectSubjects("Physics", "English", "Computer Science");
        formsPage.selectHobbies();
        formsPage.uploadPicture("C:\\Screenshot (106).png");
        formsPage.enterCurrentAddress("123 jalandhar");
        formsPage.selectState("Haryana");
        formsPage.selectCity("Panipat");
        formsPage.clickSubmit();

		Thread.sleep(5000);
    }

    @AfterMethod
	@AfterClass
    public void tearDown()throws InterruptedException {
    	Thread.sleep(3000);
    	driver.quit();
    }
}
