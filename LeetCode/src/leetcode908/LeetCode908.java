package leetcode908;

import java.util.Arrays;

public class LeetCode908 {

    public static void main(String[] args) {
        int[] arg = {1,3,6};
        System.out.println(new LeetCode908().smallestRangeI(arg, 3));
    }

    public int smallestRangeI(int[] A, int K) {
        if (A.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int a : A) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        K = Math.abs(K);
        if (max - min <= 2 * K) {
            return 0;
        }
        return max - min - 2 * K;
    }
}
