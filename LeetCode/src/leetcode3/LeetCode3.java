package leetcode3;

import java.util.HashMap;

/**
 * Created by bumblebee on 2019/10/30.
 */
public class LeetCode3 {

    public static void main(String[] args) {
        System.out.println(new LeetCode3().lengthOfLongestSubstring("bwf"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i ++) {
            char curChar = s.charAt(i);
            if (map.keySet().contains(curChar)) {
                left = Math.max(map.get(curChar) + 1, left);
            }
            max = Math.max(max, i - left + 1);
            map.put(curChar, i);
            if (s.length() - i < max) {
                return max;
            }
        }
        return max;
    }
}
