package leetcode113;

import data.TreeNode;
import utils.BinaryTreeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by bumblebee on 2019/11/10.
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 */
public class LeetCode113 {

    public static void main(String[] args) {
        LeetCode113 no25 = new LeetCode113();
        TreeNode root = BinaryTreeUtils.createBinaryTreeByArray(new Integer[]{/*5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1*/-2, null, -3});
        no25.pathSum(root, -5);
        for (List<Integer> result : no25.mLists) {
            System.out.println(result.toString());
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        findPath(root, sum);
        return mLists;
    }

    private int mCurrentSum;
    private Stack<Integer> mStack = new Stack<>();
    private List<List<Integer>> mLists = new ArrayList<>();

    private void findPath(TreeNode root, int target) {
        if (root == null) {
            return;
        }

        mStack.push(root.val);
        mCurrentSum += root.val;

        if (mCurrentSum == target && root.left == null && root.right == null) {
            List<Integer> result = new ArrayList<>();
            result.addAll(mStack);
            mLists.add(result);
            mCurrentSum -= mStack.pop();
            return;
        }

        if (root.left != null) {
            findPath(root.left, target);
        }

        if (root.right != null) {
            findPath(root.right, target);
        }

        mCurrentSum -= mStack.pop();
    }
}
