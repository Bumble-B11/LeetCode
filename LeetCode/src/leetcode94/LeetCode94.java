package leetcode94;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/1.
 */
public class LeetCode94 {
    private List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverseTree(root);
        return result;
    }

    private void traverseTree(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseTree(root.left);
        result.add(root.val);
        traverseTree(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
