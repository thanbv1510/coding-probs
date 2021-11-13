/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
    }

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
