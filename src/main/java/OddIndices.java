import project_utils.Utils;

public class OddIndices {
    public int[] oddIndices (int[] array) {
        if (array.length != 0) {
            int countOdd = Utils.countArrayLengthOfOddIndices(array);
            int oddNum = 0;
            int[] oddArray = new int[countOdd];
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    oddArray[oddNum] = array[i];
                    oddNum++;
                }
            }

            return oddArray;
        } else {

            return new int[0];
        }
    }
}
