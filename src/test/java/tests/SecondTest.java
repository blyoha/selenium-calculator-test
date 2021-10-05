package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Pages.SearchPage;

import java.io.UnsupportedEncodingException;

public class SecondTest extends BaseTest {
    CalculatorPage calculator;
    SearchPage search;
    String problem;

    @Test(priority = 0)
    public void testCase() throws UnsupportedEncodingException {
        problem = "6/0=";
        search = new SearchPage(driver);
        calculator = search.goToCalc();
        calculator.inputProblem(problem);
    }

    @Test(priority = 1)
    public void verifyProblemResult() {
        String answerField = calculator.getAnswerField();
        Assert.assertEquals(answerField, "Infinity", "Unexpected result");
    }

    @Test(priority = 2)
    public void verifyHistory() {
        String historyField = calculator.getHistoryField();
        Assert.assertEquals(historyField, problem, "Unexpected history");
    }
}
