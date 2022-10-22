public class AreNumbersEqual {
    public String areNumbersEqual(int num1, int num2) {
            if (num1 == num2) {
                return "0";
            } else if (num1 < num2) {
                return "-1";
            } else {
                return "1";
            }
        }

}
