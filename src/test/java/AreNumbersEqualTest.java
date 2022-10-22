import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    /*
    Test Data:
    89, 89
    Expected result: 0
    -89, 89
    Expected result: -1
    89, -89
    Expected result: 1
     */
    @Test
    public void testBothNumberIsEqual() {
        int num1 = 89;
        int num2 = 89;

        String expectedResult = "0";

        String actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testFirstNumberIsNegative() {
        int num1 = -89;
        int num2 = 89;

        String expectedResult = "-1";

        String actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSecondNumberIsNegative() {
        int num1 = 89;
        int num2 = -89;

        String expectedResult = "1";

        String actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
