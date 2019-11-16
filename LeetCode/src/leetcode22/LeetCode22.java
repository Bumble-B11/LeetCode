package leetcode22;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/16.
 * 给定一个数字n表示括号的数量，求所有可能产生的有效括号的排列
 */
public class LeetCode22 {

    private List<String> mResult = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new LeetCode22().generateParenthesis(3).toString());
    }

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return mResult;
        }
        String temp = "";
        generateParenthesis(temp, 0, 0, n);
        return mResult;
    }

    public void generateParenthesis(String temp, int open, int close, int max) {
        if (max * 2 == temp.length()) {
            mResult.add(String.valueOf(temp));
            return;
        }

        if (open < max) {
            generateParenthesis(temp + "(", open + 1, close, max);
        }
        if (close < open) {
            generateParenthesis(temp + ")", open, close + 1, max);
        }
    }
}
