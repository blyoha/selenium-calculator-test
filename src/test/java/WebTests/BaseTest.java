package WebTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\GitHub\\SDET Test\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void finish() {
        // Quit browser
        driver.quit();
    }
}
