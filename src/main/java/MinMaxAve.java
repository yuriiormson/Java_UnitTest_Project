import project_utils.Utils;

import java.util.Arrays;

public class MinMaxAve {
    public int[] minMaxAve (int[] array, int startIndex, int endIndex) {
        if (array.length > 2 && startIndex < endIndex && startIndex >= 0 && endIndex <= array.length) {

            int min = array[startIndex];
            int max = array[startIndex];

            int countIndex = 0;
            int sum = 0;

            for (int i = startIndex; i <= endIndex; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }
                countIndex++;
                sum += array[i];
            }
            int avg = sum /countIndex;

            int[] minMaxAvg = new int[]{min, max, avg};
            return minMaxAvg;
        }
        return new int[0];

    }
}
