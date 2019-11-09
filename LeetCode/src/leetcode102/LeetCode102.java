package leetcode102;

import data.TreeNode;
import utils.BinaryTreeUtils;

import java.util.*;

/**
 * Created by bumblebee on 2019/11/9.
 */
public class LeetCode102 {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtils.createBinaryTreeByArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> result = new LeetCode102().levelOrder(root);

        for (List<Integer> levelNodes : result) {
            System.out.println(levelNodes.toString());
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        int level = 0;

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);

        while (!treeNodes.isEmpty()) {

            result.add(new ArrayList<>());

            int levelLength = treeNodes.size();
            for (int i = 0; i < levelLength; i ++) {
                TreeNode node = treeNodes.poll();
                if (node == null) {
                    continue;
                }
                result.get(level).add(node.val);
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
            }
            level ++;
        }

        return result;
    }
}
