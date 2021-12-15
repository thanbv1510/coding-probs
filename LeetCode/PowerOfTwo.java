/**
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) return true;
        if (n > 3) {
            int temp = n & (n - 1);
            return temp == 0;
        }

        return false;
    }
}
