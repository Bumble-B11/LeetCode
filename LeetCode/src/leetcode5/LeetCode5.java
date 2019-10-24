package leetcode5;

/**
 * Created by bumblebee on 2019/10/25.
 */
public class LeetCode5 {

    public static void main(String[] args) {
        System.out.println(new LeetCode5().longestPalindrome("cbbd"));
    }

    public String longestPalindrome(String s) {
        int length = s.length();
        while (length > 0) {
            for (int i = 0; i <= s.length() - length; i ++) {
                String sub = s.substring(i, i + length);
                if (isPalindrome(sub)) {
                    return sub;
                }
            }
            length --;
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i ++;
                j --;
            } else {
                return false;
            }
        }
        return true;
    }
}
