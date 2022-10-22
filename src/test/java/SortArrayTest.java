import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {
    @Test
    public void testPositiveNumbers() {
        int[] array = {8, 7, 6, 5, 4, 1};
        int[] expectedResult = {1, 4, 5, 6, 7, 8};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testNegativeNumbers() {
        int[] array = {8, 7, 6, -5, -4, -1};
        int[] expectedResult = {-5, -4, -1, 6, 7, 8};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testArrayWithOneNumber() {
        int[] array = {8};
        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testArrayWithTwoNumbers() {
        int[] array = {8,1};
        int[] expectedResult = {1,8};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testArrayWithTwoZeroNumbers() {
        int[] array = {0,0};
        int[] expectedResult = {0,0};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
