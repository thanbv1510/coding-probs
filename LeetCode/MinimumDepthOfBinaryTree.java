import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        visit(root, 0, data);
        return !data.isEmpty() ? data.get(0) : 0;
    }

    public static void visit(TreeNode node, int count, List<Integer> data) {
        if (node != null) {
            count++;
            int temp = data.isEmpty() ? -1 : data.get(0);
            if (count >= temp && temp > 0) {
                return;
            }

            if (node.left == null && node.right == null) {
                data.add(0, count);
            }
            visit(node.left, count, data);
            visit(node.right, count, data);
        }
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