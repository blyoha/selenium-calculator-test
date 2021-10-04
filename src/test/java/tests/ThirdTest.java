package tests;

import Pages.CalculatorPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{
    @Test
    public void testCase() {
        String problem = "sin(=";
        SearchPage search = new SearchPage(driver);
        CalculatorPage calculator = search.goToCalc();
        calculator.inputProblem(problem);
    }
}
