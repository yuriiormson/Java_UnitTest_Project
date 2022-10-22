import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    @Test
    public void testPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int num = 2;
        int[] expectedResult = {2, 4, 6, 8, 10};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array,num);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int num = 2;
        int[] expectedResult = {-2, -4, -6, -8, -10};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array,num);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testMultiplyOnNull() {
        int[] array = null;
        int num = 2;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array,num);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntToDouble() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDoubleToInt() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntToString() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDoubleToString() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] expectedResult = {"1.0", "2.0", "3.0", "4.0", "5.0"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
