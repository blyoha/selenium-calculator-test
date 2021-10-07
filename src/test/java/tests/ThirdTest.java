package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.UnsupportedEncodingException;

import pages.CalculatorPage;
import pages.SearchPage;

@Epic("Calculator test")
@Feature("Third case test")
public class ThirdTest extends BaseTest {
    CalculatorPage calculator;
    SearchPage search;
    String problem;

    @Test(description = "Testing calculator")
    @Description("Opening Google Search, redirecting to calculator page and passing the math problem")
    public void testCase() throws UnsupportedEncodingException {
        problem = "sin(=";
        search = new SearchPage(driver);
        calculator = search.goToCalc();
        calculator.inputProblem(problem);
    }

    @Test(description = "Verifying calculating result")
    @Description("Comparing the expected math problem result with the actual")
    public void verifyProblemResult() {
        String answerField = calculator.getResultField();
        Assert.assertEquals(answerField, "Error", "Unexpected result");
    }

    @Test(description = "Verifying calculator history field")
    @Description("Comparing the expected calculator history with the actual")
    public void verifyHistory() {
        String historyField = calculator.getHistoryField();
        Assert.assertEquals(historyField, problem, "Unexpected history");
    }
}
