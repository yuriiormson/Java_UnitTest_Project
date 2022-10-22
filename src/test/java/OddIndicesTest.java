import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    /*
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
     */
    @Test
    public void testArrayWithRandomNumbers() {
        int[] array = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new  OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = new  OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test() {
        int[] array = {3};

        int[] expectedResult = {};

        int[] actualResult = new  OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
