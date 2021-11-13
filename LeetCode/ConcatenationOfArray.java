import java.util.Arrays;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] result = new int[2 * size];

        System.arraycopy(nums, 0, result, 0, size);
        System.arraycopy(nums, 0, result, size, size);

        return result;
    }
}
