package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class CalculatorPage extends BaseTest {
    WebDriver   driver;
    WebElement  calculator,
                resultField,
                historyField,
                divSym,
                multSym;
    String      problemField;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Inputting the problem into calculator...")
    public void inputProblem(String problem) {
        calculator = driver.findElement(By.className("jlkklc"));
        calculator.sendKeys(problem);
        problemField = driver.findElement(By.id("cwos")).getText() + "=";
        calculator.sendKeys("=");
        resultField = driver.findElement(By.id("cwos"));
        historyField = driver.findElement(By.className("vUGUtc"));

        divSym = driver.findElement(By.xpath("//div[@jsname='WxTTNd']"));
        multSym = driver.findElement(By.xpath("//div[@jsname='YovRWb']"));
    }

    @Step("Getting result field...")
    public String getResultField() {
        return resultField.getText();
    }

    @Step("Getting history field...")
    public String getHistoryField() {
        return historyField.getText().replaceAll(" ", "");
    }

    @Step("Getting problem field...")
    public String getProblemField() {
        problemField = problemField
                .replaceAll(" ", "")
                .replaceAll("/", divSym.getText())
                .replaceAll("\\*", multSym.getText());

        return problemField;
    }
}
