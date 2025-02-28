import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetAfterSorting {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
            if (nums[i] > target) {
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 2 };
        int target = 2;
        
        System.out.println(targetIndices(nums, target));
    }
}