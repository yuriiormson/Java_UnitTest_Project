import project_utils.Utils;

import java.util.Arrays;

public class OddEvenValuesInArray {
    public int countEvenValuesInArray(int[] array) {
        int countEvenNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                countEvenNum++;
            }
        }
        return countEvenNum;
    }

    public int countOddValuesInArray(int[] array) {
       return Utils.countArrayLengthOfOddIndices(array);
    }

    public boolean areValuesGreaterThanNumber(int[] array, int num) {
        boolean greaterThanNumber = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                greaterThanNumber = true;
            } else {
                greaterThanNumber = false;
            }
        }
        return greaterThanNumber;
    }

}
