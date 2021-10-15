package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public static WebDriver driver;

    @Step("Initializing...")
    @Description("Setting up Webdriver")
    @BeforeClass
    public void initialize() {
        String os = System.getProperty("os.name");

        if (os.equals("Windows 10")) {
            // Chromedriver for Windows 10
            System.setProperty("webdriver.chrome.driver", "D:\\work\\GitHub\\SDET Test\\chromedriver\\chromedriver.exe");
        }
        else {
            // Chromedriver for Linux
            System.setProperty("webdriver.chrome.driver", "D:\\work\\GitHub\\SDET Test\\chromedriver\\chromedriver");
        }

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
    }

    @Step("Quitting browser...")
    @Description("Quitting web browser")
    @AfterClass
    public void finish() {
        driver.quit();
    }
}
