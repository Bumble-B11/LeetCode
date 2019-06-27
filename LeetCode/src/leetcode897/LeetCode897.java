package leetcode897;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/6/27.
 */
public class LeetCode897 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node5.left = node3;
        node3.left = node2;
        node2.left = node1;
        node3.right = node4;
        node5.right = node6;
        node6.right = node8;
        node8.left = node7;
        node8.right = node9;

        new LeetCode897().increasingBST(node5);
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> sortList = new ArrayList<>();
        getNode(root, sortList);
        if (sortList.isEmpty()) {
            return null;
        }
        if (sortList.size() == 1) {
            return root;
        }
        root = new TreeNode(sortList.get(0));
        TreeNode currentNode = root;
        for (int i = 1; i < sortList.size(); i ++) {
            currentNode.right = new TreeNode(sortList.get(i));
            currentNode = currentNode.right;
        }
        return root;
    }

    private void getNode(TreeNode root, List<Integer> sortList) {
        if (root != null) {
            getNode(root.left, sortList);
            sortList.add(root.val);
            getNode(root.right, sortList);
        }
    }
}
