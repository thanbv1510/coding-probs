/**
 * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = n.charAt(0);
        for (int i = 1; i <= n.length() / 2; i++) {
            max = Math.max(max, n.charAt(i));
            max = Math.max(max, n.charAt(n.length() - i));
        }
        return (max - 48);
        // return n.chars().map(Character::getNumericValue).max().orElse(0);
    }
}
