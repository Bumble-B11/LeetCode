package leetcode946;

import java.util.Stack;

/**
 * Created by bumblebee on 2019/11/9.
 */
public class LeetCode946 {

    public static void main(String[] args) {
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,5,3,1,2};

        System.out.println(new LeetCode946().validateStackSequences(pushed, popped));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || popped == null || pushed.length != popped.length) {
            return false;
        }
        int pushIndex = 0;
        int popIndex = 0;
        Stack<Integer> stack = new Stack<>();

        for (; popIndex < popped.length; popIndex ++) {
            while (stack.isEmpty() || !stack.peek().equals(popped[popIndex])) {
                if (pushIndex > pushed.length - 1) {
                    return false;
                }
                if (pushIndex == pushed.length - 1) {
                    if (pushed[pushIndex] != popped[popIndex]) {
                        return false;
                    }
                }
                stack.push(pushed[pushIndex ++]);
            }
            stack.pop();
        }
        return true;
    }
}
