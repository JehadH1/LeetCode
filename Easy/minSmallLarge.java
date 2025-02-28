import java.util.Arrays;

public class minSmallLarge {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double[] ave = new double[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            ave[i] = (double) (nums[i] + nums[nums.length - i - 1]) / 2;

        }
        Arrays.sort(ave);
        double min = ave[0];
        return min;
    }
}