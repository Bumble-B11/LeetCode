package leetcode155;

import java.util.Stack;

/**
 * Created by bumblebee on 2019/11/9.
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 */
public class LeetCode155 {

    private Stack<Integer> mDataStack;
    private Stack<Integer> mMinStack;

    public LeetCode155() {
        mDataStack = new Stack<>();
        mMinStack = new Stack<>();
    }

    public void push(int x) {
        mDataStack.push(x);
        Integer min = getMin();
        if (x <= min) {
            mMinStack.push(x);
        }/* else {
            mMinStack.push(min);
        }*/
    }

    public void pop() {
        int x = mDataStack.pop();
        if (x == getMin()) {
            mMinStack.pop();
        }
    }

    public int top() {
        return mDataStack.peek();
    }

    public int getMin() {
        if (mMinStack.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return mMinStack.peek();
    }
}
