public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int mxarea = 0;
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int base = height.length - 1;

        while (left < right) {
            area = base * Math.min(height[left], height[right]);
            mxarea = Math.max(mxarea, area);

            if (height[left] < height[right]) {
                left++;
                base--;
            } else {
                right--;
                base--;
            }
        }
        return mxarea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.err.println("the max area is " + maxArea(height));
    }
}