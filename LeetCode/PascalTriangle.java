import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        if (numRows == 1) {
            return result;
        }

        result.add(Arrays.asList(1, 1));
        int index = 2;
        while (index < numRows) {
            List<Integer> preData = result.get(index - 1);
            List<Integer> currentData = new ArrayList<>();
            currentData.add(0, 1);
            for (int i = 1; i < index; i++) {
                currentData.add(i, preData.get(i - 1) + preData.get(i));
            }
            currentData.add(index, 1);

            result.add(currentData);
            index++;
        }
        return result;
    }
}
