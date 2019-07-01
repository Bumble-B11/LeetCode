package leetcode872;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/7/1.
 */
public class LeetCode872 {

    private List<Integer> root1Leaves;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        root1Leaves = new ArrayList<>();
        dfs(root1);
        return check(root2);
    }

    private void dfs(TreeNode node) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            if (node1.left == null && node1.right == null) {
                root1Leaves.add(node1.val);
                continue;
            }
            if (node1.right != null) {
                stack.push(node1.right);
            }
            if (node1.left != null) {
                stack.push(node1.left);
            }
        }
    }

    private boolean check(TreeNode node) {
        int i = 0;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            if (node1.left == null && node1.right == null) {
                if (i < root1Leaves.size() && node1.val == root1Leaves.get(i)) {
                    i ++;
                    continue;
                }
                return false;
            }
            if (node1.right != null) {
                stack.push(node1.right);
            }
            if (node1.left != null) {
                stack.push(node1.left);
            }
        }
        return true;
    }
}
