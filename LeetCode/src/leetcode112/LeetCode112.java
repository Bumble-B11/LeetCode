package leetcode112;

import data.TreeNode;
import utils.BinaryTreeUtils;

/**
 * Created by bumblebee on 2019/11/10.
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class LeetCode112 {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtils.createBinaryTreeByArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1/*-2, null, -3*/});
        System.out.println(new LeetCode112().hasPathSum(root, 22));
    }

    /*private int mCurrentSum;
    private Stack<Integer> mStack = new Stack<>();

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        mStack.push(root.val);
        mCurrentSum += root.val;

        if (mCurrentSum == sum && root.left == null && root.right == null) {
            mCurrentSum -= mStack.pop();
            return true;
        }

        boolean left = false;
        if (root.left != null) {
            left = hasPathSum(root.left, sum);
        }

        boolean right = false;
        if (root.right != null) {
            right = hasPathSum(root.right, sum);
        }

        mCurrentSum -= mStack.pop();
        return left || right;
    }*/
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
