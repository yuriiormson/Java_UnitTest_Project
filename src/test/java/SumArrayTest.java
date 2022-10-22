import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    /*
    Test Data:
    {0, 1, 2, 3, 4, 5} → 15
    {-7, -3} → -10
     */
    @Test
    public void testArrayWithPositiveNumbers() {
        int[] array = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] array = {-7, -3};

        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
