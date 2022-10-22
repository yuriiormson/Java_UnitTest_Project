public class IsPositiveNumber {
    public String isPositiveNumber(int num) {
        if (num != 0) {
            if (num > 0) {
                return "true";
            } else {
                return "false";
            }
        } else {
            return "Enter value greater or smaller than 0";
        }
    }
}
