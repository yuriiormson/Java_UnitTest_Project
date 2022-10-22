public class OddEven {
    public String oddEven (int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        return result;
    }
}
