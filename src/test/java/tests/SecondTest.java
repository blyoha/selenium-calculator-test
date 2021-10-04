package tests;

import Pages.CalculatorPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {
    @Test
    public void testCase() {
        String problem = "6/0=";
        SearchPage search = new SearchPage(driver);
        CalculatorPage calculator = search.goToCalc();
        calculator.inputProblem(problem);
    }
}
