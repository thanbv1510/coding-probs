import java.util.Arrays;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        // return Arrays.stream(accounts).map(i -> Arrays.stream(i).sum()).reduce((a, b) -> a > b ? a : b).orElse(0);
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().orElse(0);
    }
}