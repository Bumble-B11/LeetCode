package leetcode965;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bumblebee on 2019/1/30.
 */
public class LeetCode965 {

//    private boolean isFirstInsert = false;
    private Set<Integer> values = new HashSet<>();

    public boolean isUnivalTree(TreeNode root) {
        ergodic(root);
        return values.size() == 1;
    }

    private void ergodic(TreeNode node) {
        if (node != null) {
            values.add(node.val);
            ergodic(node.left);
            ergodic(node.right);
        }
    }
}
