import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*  TO DO:
    - Add classes for testcases
    - Implement page classes
    - Implement BaseTest class

    - Remove needless files form Git repo
    - Drink coffee
 */

public class Main {
    public static void main(String[] args) {
        // Set Chrome Webdriver
        System.setProperty("webdriver.chrome.driver", "D:\\work\\GitHub\\SDET Test\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open URL in Chrome
        driver.get("https://google.com");

        // Search for Calculator
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("calculator", Keys.ENTER);

        // Enter example
        WebElement calculator = driver.findElement(By.className("jlkklc"));
        // CASE #1
        calculator.sendKeys("(1+2)*3-40/5=");
        // CASE #2
        calculator.sendKeys("6/0=");
        // CASE #3
        calculator.sendKeys("sin(");

        // Close browser
        driver.quit();
    }
}
