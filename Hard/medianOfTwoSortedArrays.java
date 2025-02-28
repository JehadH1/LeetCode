import java.util.*;

public class medianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        Arrays.sort(arr3);

        int pos = 0;
        double sum = 0;
        if (arr3.length % 2 != 0) {
            pos = arr3.length / 2;
            sum = arr3[pos];
            return sum;
        } else {
            pos = arr3.length / 2;
            sum = (arr3[pos - 1] + arr3[pos]) / 2;
            return sum;
        }
    }
}
