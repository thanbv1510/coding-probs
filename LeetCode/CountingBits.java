/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        if (n == 0) {
            return result;
        }
        result[1] = 1;
        int temp = 1;
        for (int i = 2; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                result[i] = 1;
                temp = 1;
                continue;
            }
            result[i] = temp + result[i - 1];

            temp = 0;
            int index = 0;
            while (true) {
                if (((i >> index++) & 1) == 0) {
                    temp++;
                    break;
                }
                temp--;
            }
        }
        return result;
    }
}
