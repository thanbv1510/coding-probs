/**
 * https://leetcode.com/problems/maximum-subarray/
 */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for (int num : nums) {
            local_max = Math.max(num, num + local_max);
            global_max = Math.max(local_max, global_max);
        }

        return global_max;
    }
}