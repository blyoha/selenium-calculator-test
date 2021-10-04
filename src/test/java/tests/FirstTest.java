package tests;

import Pages.CalculatorPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void testCase() {
        String problem = "(1+2)*3-40/5=";
        SearchPage search = new SearchPage(driver);
        CalculatorPage calculator = search.goToCalc();
        calculator.inputProblem(problem);
    }
}
