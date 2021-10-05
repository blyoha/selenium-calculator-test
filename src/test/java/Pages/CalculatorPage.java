package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class CalculatorPage extends BaseTest {
    WebDriver driver;
    WebElement calculator;
    WebElement answerField;
    WebElement historyField;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputProblem(String problem) {
        calculator = driver.findElement(By.className("jlkklc"));
        calculator.sendKeys(problem);
        answerField = driver.findElement(By.id("cwos"));
        historyField = driver.findElement(By.className("vUGUtc"));
    }

    public String getAnswerField() {
        return answerField.getText();
    }

    public String getHistoryField() {
        return historyField.getText().replaceAll(" ", "");
    }
}
