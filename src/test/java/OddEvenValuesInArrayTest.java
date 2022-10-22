import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {
    @Test
    public void testCountEvenValuesInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 3;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountOddValuesInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 2;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumberTrue() {
        int[] array = {1, 2, 3, 4, 5};
        int num = 3;
        boolean expectedResult = true;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, num);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumberFalse() {
        int[] array = {1, 2, 3, 4, 5};
        int num = 6;
        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, num);

        Assert.assertEquals(actualResult,expectedResult);
    }

}
