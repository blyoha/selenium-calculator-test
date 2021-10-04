package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class CalculatorPage extends BaseTest {
    private WebDriver driver;
    WebElement calculator;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputProblem(String problem) {
        calculator = driver.findElement(By.className("jlkklc"));
        calculator.sendKeys(problem);
    }
}
