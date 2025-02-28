public class sumOfTwoSquares {
    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) (Math.sqrt(c));

        while (start <=end) {
            if ((start * start) + (end * end) == c) {
                return true;
            } else if ((start * start) + (end * end) > c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int c = 17;

        System.out.println(judgeSquareSum(13));
    }
}
