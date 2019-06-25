package leetcode942;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/1/28.
 */
public class LeetCode942 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode942().diStringMatch("IDID")));
    }

    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] retval = new int[length +1];
        int low = 0; int high = length;
        for(int i=0; i<length; i++){
            if(S.charAt(i)=='I')
                retval[i] = low++;
            else
                retval[i] = high--;
        }
        retval[length] = low;
        return retval;
    }
}
