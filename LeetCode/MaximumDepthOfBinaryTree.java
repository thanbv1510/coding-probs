import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
    public static void visit(TreeNode node, int count, List<Integer> data) {
        if (node != null) {
            count++;
            if (node.left == null && node.right == null) {
                int temp = data.isEmpty() ? -1 : data.get(0);
                if (count < temp) {
                    return;
                }
                data.add(0, count);

            }
            visit(node.left, count, data);
            visit(node.right, count, data);
        }
    }

    public int maxDepth(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        visit(root, 0, data);
        return !data.isEmpty() ? data.get(0) : 0;
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
