package leetcode922;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/2/8.
 */
public class LeetCode922 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode922().sortArrayByParityII(new int[]{4,2,5,7})));
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];

        int oddIndex = 1;
        int evenIndex = 0;

        for (int i = 0; i < A.length; i ++) {
            if (A[i] % 2 == 0) {
                result[evenIndex] = A[i];
                evenIndex += 2;
            } else {
                result[oddIndex] = A[i];
                oddIndex += 2;
            }
        }

        return result;
    }
}
