import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testOrderOfNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = 2;
        int endIndex = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEqualIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = 2;
        int endIndex = 2;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartBiggerThanEnd() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = 6;
        int endIndex = 2;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNegativeValueInArray() {
        int[] array = {-8, -7, -6, -5, 5, 6, 7, 8};
        int startIndex = 2;
        int endIndex = 6;
        int[] expectedResult = {-6, 7, 1};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNegativeRandomValueInArray() {
        int[] array = {-8, 1, -6, 2, -5, 3, -6, 4};
        int startIndex = 2;
        int endIndex = 6;
        int[] expectedResult = {-6, 3, -2};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOutOfBoundStart() {
        int[] array = {-8, 1, -6, 2, -5, 3, -6, 4};
        int startIndex = -2;
        int endIndex = 6;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOutOfBoundEnd() {
        int[] array = {-8, 1, -6, 2, -5, 3, -6, 4};
        int startIndex = 2;
        int endIndex = 11;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartAndEndTooClose() {
        int[] array = {-8, 1, -6, 3, -5, 3, -6, 4};
        int startIndex = 2;
        int endIndex = 3;
        int[] expectedResult = {-6, 3, -1};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int startIndex = 2;
        int endIndex = 8;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testArrayWithOneValue() {
        int[] array = {1};
        int startIndex = 2;
        int endIndex = 8;
        int[] expectedResult = {};

        int[] actualResult = new  MinMaxAve().minMaxAve(array,startIndex,endIndex);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
