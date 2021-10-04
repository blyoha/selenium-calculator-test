package Pages;

import org.openqa.selenium.By;
import tests.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BaseTest {
    private WebDriver driver;
    private static String pageUrl = "https://google.com";
    private String calcRequest = "calculator";

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    public CalculatorPage goToCalc() {
        WebElement searchLine = driver.findElement(By.name("q"));
        searchLine.sendKeys(calcRequest, Keys.ENTER);
        return new CalculatorPage(driver);
    }
}
