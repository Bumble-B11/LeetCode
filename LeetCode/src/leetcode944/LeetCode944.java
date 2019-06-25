package leetcode944;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/1/29.
 */
public class LeetCode944 {
    public static void main(String[] args) {
        System.out.println(new LeetCode944().minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }

    public int minDeletionSize(String[] A) {
//        A.length 行数
//        A[0].length() 列数
        char[][] aCharArray = new char[A.length][A[0].length()];
        for (int i = 0; i < A.length; i ++) {
            aCharArray[i] = A[i].toCharArray();
            System.out.println(Arrays.toString(aCharArray[i]));
        }
        int count = 0;
        for (int i = 0; i < A[0].length(); i ++) {
            for (int j = 0; j < A.length - 1; j ++) {
                if (aCharArray[j][i] >= aCharArray[j + 1][i]) {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
