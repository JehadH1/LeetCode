public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

        int pos = -10;
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[0]) {
                System.out.println("0  ");
                pos = 0;
                break;
            } else if (nums[i] == target) {
                System.out.print("1  ");
                pos = i;
                break;
            } else if ((target > nums[i])) {
                if (i < nums.length - 1) {
                    if (target < nums[i + 1]) {
                        System.out.print("2  ");
                        pos = i + 1;
                        break;
                    }
                } else {
                    System.out.print("3  ");
                    pos = nums.length;
                    break;
                }
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 6 };
        int target = 0;
        int s = searchInsert(nums, target);
        System.err.println("The position the number shoud be in is at " + s);
    }
}