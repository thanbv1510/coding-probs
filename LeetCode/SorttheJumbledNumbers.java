import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/contest/biweekly-contest-73/problems/sort-the-jumbled-numbers/
 */
public class SorttheJumbledNumbers {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Integer[] result = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Comparator.comparingInt(a -> mappingNumber(mapping, a)));

        return Arrays.stream(result).mapToInt(i -> i).toArray();
    }

    public int mappingNumber(int[] mapping, int num) {
        if (num == 0) {
            return mapping[0];
        }

        int result = 0;
        int x = 1;
        while (num != 0) {
            result += mapping[num % 10] * x;
            x *= 10;
            num /= 10;
        }

        return result;
    }
}
