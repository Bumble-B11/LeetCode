package leetcode387;

/**
 * Created by bumblebee on 2019/11/12.
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class LeetCode387 {
    public static void main(String[] args) {
        System.out.println(new LeetCode387().firstUniqChar("aeacccdbff"));
    }

    private int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] temp = new int[256];

        for (int i = 0; i < temp.length; i ++) {
            temp[i] = 0;
        }

        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            temp[c] ++;
        }

        for (int i = 0; i < sChars.length; i ++) {
            if (temp[sChars[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
}
