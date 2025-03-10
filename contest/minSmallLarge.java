import java.util.Arrays;

public class minSmallLarge {
    public static void main(String[] args) {
        int[] array = { 7, 8, 3, 4, 15, 13, 4, 1 };
        Arrays.sort(array);

        double[] ave = new double[array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            ave[i] = (double)(array[i] + array[array.length - i - 1]) / 2;

        }
        Arrays.sort(ave);
        System.out.println(ave[0]);
    }
}