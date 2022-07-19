import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        int mid = nums.length / 2;
        int currentRevertIndex = nums.length - 1;
        for (int i = 0; i <= mid; i++) {
            if (i == currentRevertIndex && i == mid && !data.add(nums[i])) {
                return true;
            }

            if (i < currentRevertIndex) {
                boolean isDuplicate = !data.add(nums[i]) || !data.add(nums[currentRevertIndex]);
                if (isDuplicate) {
                    return true;
                }
            }

            currentRevertIndex--;
        }

        return false;
    }
}
