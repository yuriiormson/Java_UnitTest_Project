import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    /*
    Test Data:
    -345 →  “Odd”
    0 →  “Even”
    222222 →  “Even”
     */
    @Test
    public void testNumberLessThanNull() {
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNumberEqualNull() {
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNumberGreaterThanNull() {
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

}
