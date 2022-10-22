package project_utils;

public class Utils {

    public static int countArrayLength(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
                count++;
        }
        return count;
    }
    public static int countArrayLengthOfOddIndices(int[] array) {
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    public static int minValueOfArray(int[] array) {
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int maxValueOfArray(int[] array) {
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getAverageValOfArray(int[] array) {
        int sum = 0;
        int l = array.length;

        for (int i = 0; i < l; i++) {
            sum += array[i];
        }

        return sum / l;
    }
}
