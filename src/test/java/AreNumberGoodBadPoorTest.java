import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumberGoodBadPoorTest {

    @Test
    public void testMinusOne() {
        int m = 7;
        String expectedResult = "-1";

        String actualResult = new AreNumberGoodBadPoor().areNumberGoodBadPoor(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testBadNumber() {
        int m = 9;
        String expectedResult = "Bad Number";

        String actualResult = new AreNumberGoodBadPoor().areNumberGoodBadPoor(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoodNumber() {
        int m = 63;
        String expectedResult = "Good Number";

        String actualResult = new AreNumberGoodBadPoor().areNumberGoodBadPoor(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPoorNumber() {
        int m = 22;
        String expectedResult = "Poor Number";

        String actualResult = new AreNumberGoodBadPoor().areNumberGoodBadPoor(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
