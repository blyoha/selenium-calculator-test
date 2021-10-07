package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class CalculatorPage extends BaseTest {
    WebDriver driver;
    WebElement calculator;
    WebElement resultField;
    WebElement historyField;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Inputting the problem into calculator...")
    public void inputProblem(String problem) {
        calculator = driver.findElement(By.className("jlkklc"));
        calculator.sendKeys(problem);
        resultField = driver.findElement(By.id("cwos"));
        historyField = driver.findElement(By.className("vUGUtc"));
    }

    @Step("Getting result field...")
    public String getResultField() {
        return resultField.getText();
    }

    @Step("Getting history field...")
    public String getHistoryField() {
        return historyField.getText().replaceAll(" ", "");
    }
}
