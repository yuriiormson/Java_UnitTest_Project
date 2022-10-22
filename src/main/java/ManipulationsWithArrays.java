import java.util.Arrays;

public class ManipulationsWithArrays {
    public int[] multiplуArrayByNumber(int[] arr, int num) {
        if (num > 0 && arr != null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * num;
            }
            return arr;
        } else {
            return new int[0];
        }
    }

    public double[] toDoubleArray(int[] arr) {
        double[] arrDo = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDo[i] = (double) arr[i];
        }
        return arrDo;
    }

    public int[] toIntArray(double[] arr) {
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = (int) arr[i];
        }
        return arrInt;
    }

    public String[] toStringArray(int[] arr) {
        String[] arrStr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrStr[i] = String.valueOf(arr[i]);
        }
        return arrStr;
    }

    public String[] toStringArray(double[] arr) {
        String[] arrStr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrStr[i] = String.valueOf(arr[i]);
        }
        return arrStr;
    }
}
