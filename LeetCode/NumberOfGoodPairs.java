import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> data = new HashMap<>();

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int orDefault = data.getOrDefault(nums[i], 0);

            if (orDefault != 0) {
                total += orDefault;
            }

            data.put(nums[i], ++orDefault);
        }

        return total;
    }
}
