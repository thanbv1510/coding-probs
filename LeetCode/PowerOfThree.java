/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        while (n > 1) {
            if (n % 3 != 0) return false;

            n /= 3;
        }
        return true;
    }
}
