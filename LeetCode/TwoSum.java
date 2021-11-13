import java.util.*;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 4};
        System.out.println(Arrays.toString(twoSum(nums, 8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> itemData = data.get(nums[i]) != null ? data.get(nums[i]) : new ArrayList<>();
            itemData.add(i);
            data.put(nums[i], itemData);
        }

        for (int i = 0; i < nums.length; i++) {
            int firstIndex = i;
            int temp = target - nums[i];
            if (data.containsKey(temp)) {
                Integer secondIndex = data.get(temp).stream().filter(item -> item != firstIndex).findFirst().orElse(null);
                if (secondIndex != null) {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }
        return null;
    }
}
