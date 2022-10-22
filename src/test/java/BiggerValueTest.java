import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    /*
    Test Data:
    3333, 9999
    Expected Result = 9999
     */
    @Test
    public void testFirstNumberBigger() {
        int num1 = 9999;
        int num2 = 3333;

        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSecondNumberBigger() {
        int num1 = 3333;
        int num2 = 9999;

        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSecondNumberBelowZero() {
        int num1 = 3333;
        int num2 = -9999;

        int expectedResult = 3333;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testBothNumbersBelowZero() {
        int num1 = -3333;
        int num2 = -9999;

        int expectedResult = -3333;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testBothNumbersZero() {
        int num1 = 0;
        int num2 = 0;

        int expectedResult = 0;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOneNumberBelowZeroSecondNumberZero() {
        int num1 = -1;
        int num2 = 0;

        int expectedResult = 0;
        int actualResult = new BiggerValue().biggerValue(num1,num2);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
