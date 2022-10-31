import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    @Test
    public void testEmptyString() {
        String str = "";
        String expectedResult = "No value";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testExtraBackspaceOnTheBeginningAndEnd() {
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testNoExtraBackspaceOnTheBeginningAndEnd() {
        String str = "Red Rover School";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testWordWithLetterA() {
        String str = "panda";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testLongWordWithLetterAs() {
        String str = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testNotValidString() {
        String str = "";
        String expectedResult = "Not valid string";
        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testValidString() {
        String str = "35429764";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testStringWithZero() {
        String str = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testStringWithZeroAndBackspaces() {
        String str = "   3504209706040000   ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testRemoveALotOfSpaces() {
        String str = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testRemoveSpaces() {
        String str = "p a     n   d a  ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testEmptyStringRemoveAllSpaces() {
        String str = "";
        String expectedResult = "Not valid string";
        String actualResult = new StringMethods().removeAllSpaces(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testAbracadabra() {
        String str = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testHomenumRevelio() {
        String str = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test3tarAmasAlatA() {
        String str = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testJavaCount() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current" +
                " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy" +
                " version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer" +
                " zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        boolean actualResult = new StringMethods().countJava(str);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void test99Bugs() {
        String str = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean actualResult = new StringMethods().countJava(str);
        Assert.assertFalse(actualResult);
    }
    @Test
    public void testDoubleQoutes() {
        String str = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testTwoDotsFirstStringAndDoubleQoutesSecondString() {
        String str = "My eyes could see, my ears could hear";
        String str2 = "\"The mighty river roar.\"";
        String expectedResult = "My eyes could see, my ears could hear:" + " "
                + "\"" + "\"" + "The mighty river roar.\"" + "\"";
        String actualResult = new StringMethods().insertQuotes(str,str2);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testUppercaseFirstLetter() {
    String str = "kYiV";
    String expectedResult = "Kyiv";
    String actualResult = new StringMethods().improveCityName(str);
    Assert.assertEquals(actualResult,expectedResult);
    }
}
