package leetcode832;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/1/27.
 */
public class LeetCode832 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode832().reversedArray(new int[]{1,1,0,0})));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A[0].length; i ++) {
            A[i] = reversedArray(A[i]);
        }
        return A;
    }

    private int[] reversedArray(int[] A) {
        int length = A.length;
        for (int i = 0; i < length / 2; i++) {
            int swap = 0;
            swap = A[i];
            A[i] = A[length - 1 - i];
            A[length - 1 - i] = swap;
            A[i] ^= 1;
            A[length - 1 - i] ^= 1;
        }
        if (length % 2 == 1) {
            A[length / 2] ^= 1;
        }
        return A;
    }
}