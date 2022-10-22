import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    @Test
    public void testRandomNumbers() {
        int num1 = 6;
        int num2 = 2;
        int num3 = 8;
        int num4 = 7;
        int num5 = 5;
        int[] expectedResult = {6, 2, 8, 7, 5};

        int[] actualResult = new CreateArray().createArray(num1,num2,num3,num4,num5);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRandomDecimalNumbers() {
        double num1 = 6.24;
        double num2 = 2.12;
        double num3 = 8.86;
        double num4 = 7.1;
        double num5 = 0.5;
        double[] expectedResult = {6.24, 2.12, 8.86, 7.1, 0.5};

        double[] actualResult = new CreateArray().createDoubleArray(num1,num2,num3,num4,num5);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRandomWords() {
        String num1 = "It";
        String num2 = "was";
        String num3 = "an";
        String num4 = "apple";
        String num5 = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(num1,num2,num3,num4,num5);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
