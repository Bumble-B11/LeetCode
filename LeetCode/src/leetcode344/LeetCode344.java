package leetcode344;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/6/30.
 */
public class LeetCode344 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode344().reverseString("hello".toCharArray())));
    }

    public char[] reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
        return s;
    }
}
