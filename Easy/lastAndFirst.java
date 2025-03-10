public class lastAndFirst {
    public static int[] searchRange(int[] nums, int target) {
        int min = 100000;
        int max = -100000;
        boolean found = false;
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1])
            return new int[] { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = true;
                min = Math.min(min, i);
                max = Math.max(max, i);
            } else if (nums[i] > target) {
                break;
            }
        }
        return found ? new int[] { min, max } : new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 5, 7, 7, 9, 10 };

        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
}