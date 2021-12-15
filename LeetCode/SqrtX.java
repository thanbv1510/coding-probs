/**
 * https://leetcode.com/problems/sqrtx/
 */
class SqrtX {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int temp = x / 2;
        if (temp == 1) {
            return temp;
        }

        int start = 1;
        int end = x / 2;
        while (temp > 0) {
            if (temp == x / temp) {
                return temp;
            }

            if (temp > x / temp) {
                end = temp;
            } else if (temp < x / temp) {
                start = temp;
            }
            temp = (end + start) / 2;
            if (temp == start) {
                return temp;
            }
        }

        return 1;
    }
}