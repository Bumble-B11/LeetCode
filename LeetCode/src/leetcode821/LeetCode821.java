package leetcode821;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bumblebee on 2019/6/30.
 */
public class LeetCode821 {

    public static void main(String[] args) {
        String s = "loveleetcode";
        char C = 'e';
        System.out.println(Arrays.toString(new LeetCode821().shortestToChar(s, C)));
    }

    public int[] shortestToChar(String S, char C) {
        char[] source = S.toCharArray();
        Set<Integer> indexSet = new HashSet<>();
        for (int i = 0; i < source.length; i ++) {
            if (C == source[i]) {
                indexSet.add(i);
            }
        }
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i ++) {
            int min = Integer.MAX_VALUE;
            for (int index : indexSet) {
                int distance = Math.abs(index - i);
                if (distance < min) {
                    min = distance;
                }
            }

            result[i] = min;
        }
        return result;
    }

    /**
     * copy from leetcode
     * */
    /*public int[] shortestToChar(String S, char C) {
        final int len = S.length();
        final int[] result = new int[len];
        // find first
        int i = 0;
        while (S.charAt(i) != C && i < len) i++;

        // Comment out just because:
        //      C is a single character, and guaranteed to be in string S.
        //if (i == len) return result; // there is not C in the String s.

        for (int j = i; j >= 0 ; j--) {
            result[j] = i - j;
        }

        // process middle.
        int cursor = i; // last index of C.
        for (int j = i + 1; j < len ; j++) {
            if (S.charAt(j) == C) {
                int l = cursor + 1;
                int r = j - 1;
                int num = 1;
                while (l <= r) {
                    result[l++] = num;
                    result[r--] = num;
                    num++;
                }
                cursor = j;
            }
        }

        if (cursor == len - 1) return result;

        for (int j = cursor; j < len; j++) {
            result[j] = j - cursor;
        }

        return result;
    }*/
}
