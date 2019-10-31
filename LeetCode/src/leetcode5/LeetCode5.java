package leetcode5;

/**
 * Created by bumblebee on 2019/10/25.
 */
public class LeetCode5 {

    public static void main(String[] args) {
        System.out.println(new LeetCode5().longestPalindrome(""));
    }

    public String longestPalindrome(String s) {
        int length = s.length();

        boolean[][] tempResult = new boolean[length][length];
        int maxLength = 0;
        String result = "";

        for (int curLength = 1; curLength <= length; curLength ++) {
            for (int i = 0; i < length - curLength + 1; i ++) {
                int j = i + curLength - 1;
                if (curLength == 1) {
                    tempResult[i][i] = true;
                    if (curLength > maxLength) {
                        maxLength = curLength;
                        result = s.substring(i, j + 1);
                    }
                } else if (curLength == 2) {
                    if (s.charAt(i) != s.charAt(j)) {
                        continue;
                    }
                    tempResult[i][i + 1] = true;
                    if (curLength > maxLength) {
                        maxLength = curLength;
                        result = s.substring(i, j + 1);
                    }
                } else {
                    if (tempResult[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                        tempResult[i][j] = true;
                        if (curLength > maxLength) {
                            maxLength = curLength;
                            result = s.substring(i, j + 1);
                        }
                    }
                }
            }
        }

        return result;
    }

    /*public String longestPalindrome(String s) {
        int length = s.length();
        while (length > 0) {
            for (int i = 0; i <= s.length() - length; i ++) {
                String sub = s.substring(i, i + length);
                if (isPalindrome(sub)) {
                    return sub;
                }
            }
            length --;
        return "";
        }
    }*/

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
