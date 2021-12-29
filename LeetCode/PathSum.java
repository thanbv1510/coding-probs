import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum/
 */
class PathSum {
    public static void checkHasPathSum(TreeNode node, int targetSum, int sum, List<Boolean> result) {
        if (node != null) {
            sum += node.val;
            if (!result.isEmpty() && Boolean.TRUE.equals(result.get(0))) {
                return;
            }

            if (node.right == null && node.left == null && targetSum == sum) {
                result.add(0, true);
            }

            checkHasPathSum(node.left, targetSum, sum, result);
            checkHasPathSum(node.right, targetSum, sum, result);
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Boolean> result = new ArrayList<>();

        checkHasPathSum(root, targetSum, 0, result);
        return !result.isEmpty() && result.get(0);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
