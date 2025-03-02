public class missingNumber {
    public static int missingnumber(int[] arr1) {

        int n = arr1.length + 1;
        int[] arr2 = new int[n];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = 1;
        }
        for (int k = 0; k < arr2.length - 1; k++) {
            arr2[arr1[k]] = 0;
        }
        int num = 100000;
        for (int c = 0; c < arr2.length; c++) {
            if (arr2[c] == 1) {
                num = c;
            }
        }
        return num;
    }
}