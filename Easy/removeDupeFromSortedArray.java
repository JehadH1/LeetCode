public class removeDupeFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean dupe = true;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    dupe = false;
                    break;
                }
            }
            if (dupe == true) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
