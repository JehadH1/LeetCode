public class divideTwoInt {
    public int divide(int dividend, int divisor) {
        long result = ((long) dividend) / divisor;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) result;
        }
    }
}
