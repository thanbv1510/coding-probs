/**
 * https://leetcode.com/problems/climbing-stairs/
 */
class ClimbingStairs {
    public static int climbStairs(int n) {
        int x1 = 1;
        int x2 = 2;
        if (n == 1) return x1;
        if (n == 2) return x2;

        for (int i = 3; i <= n; i++) {
            x2 = x1 + x2;
            x1 = x2 - x1;
        }

        return x2;
    }
}