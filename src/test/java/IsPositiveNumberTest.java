import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    /*
    Проверьте работу метода на числах 555, 0 и -555.
     */
    @Test
    public void testPositiveNumber() {
        int num = 555;

        String expectedResult = "true";

        String actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testNegativeNumber() {
        int num = -555;

        String expectedResult = "false";

        String actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testZeroNumber() {
        int num = 0;

        String expectedResult = "Enter value greater or smaller than 0";

        String actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
