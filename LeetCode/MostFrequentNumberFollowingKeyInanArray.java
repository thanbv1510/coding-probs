import java.util.HashMap;

/**
 * https://leetcode.com/contest/biweekly-contest-73/problems/most-frequent-number-following-key-in-an-array/
 */
public class MostFrequentNumberFollowingKeyInanArray {
    public int mostFrequent(int[] nums, int key) {
        int target;
        int count = 0;
        int resultTarget = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                target = nums[i + 1];
                int tempCount = result.getOrDefault(target, 0);
                count = tempCount == 0 ? 1 : count + 1;
                if (count > maxCount) {
                    maxCount = count;
                    resultTarget = target;
                }
                result.put(target, count);
            }

        }
        return resultTarget;
    }
}
