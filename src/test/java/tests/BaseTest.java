package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void initialize() {
        String os = System.getProperty("os.name");
        String userHomeDir = System.getProperty("user.home");

        if (os.equals("Windows 10")) {
            // Chromedriver for Windows 10
            System.setProperty("webdriver.chrome.driver", userHomeDir + "\\chromedriver\\chromedriver.exe");
        }
        else {
            // Chromedriver for Linux
            System.setProperty("webdriver.chrome.driver", userHomeDir + "\\chromedriver\\chromedriver");
        }

        driver = new ChromeDriver();
    }

    @AfterTest
    public void finish() {
        driver.quit();
    }
}
