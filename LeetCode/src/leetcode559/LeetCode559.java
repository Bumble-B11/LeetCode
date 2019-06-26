package leetcode559;

public class LeetCode559 {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }
        int maxDepth = 0;
        for (Node child : root.children) {
            int depth = maxDepth(child);
            if (depth > maxDepth) {
                maxDepth = depth;
            }
        }
        return maxDepth + 1;
    }
}
