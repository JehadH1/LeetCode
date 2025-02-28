public class searchRotatedSortedArray {
    public static int search(int[] nums, int target) {

        int key = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                key = i;
                break;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7 };
        int target = 0;
        System.out.println(search(nums, target));
    }
}