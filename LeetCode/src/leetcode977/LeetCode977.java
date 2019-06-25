package leetcode977;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/1/26.
 */
public class LeetCode977 {
    public static void main(String[] args) {
        int[] a = new int[] {-7,-3,2,3,11};
        System.out.println(Arrays.toString(new LeetCode977().sortedSquares(a)));
    }

    public int[] sortedSquares(int[] A) {
        int posIndex = 0;
        int length = A.length;

        /*找到正负数的分界点*/
        while (posIndex < length && A[posIndex] <= 0) {
            posIndex ++;
        }
        int negIndex = posIndex - 1;
        int[] result = new int[length];
        int i = 0;
        /*向两边遍历，取较小的平方值填入新数组*/
        for (; negIndex > -1 && posIndex < length; i ++) {
            int negPow = A[negIndex] * A[negIndex];
            int posPow = A[posIndex] * A[posIndex];
            if (negPow < posPow) {
                result[i] = negPow;
                negIndex --;
            } else {
                result[i] = posPow;
                posIndex ++;
            }
        }

        /*处理另一个方向剩余的元素*/
        while (negIndex > -1) {
            result[i] = A[negIndex] * A[negIndex];
            i ++;
            negIndex --;
        }
        while (posIndex < length) {
            result[i] = A[posIndex] * A[posIndex];
            i ++;
            posIndex ++;
        }
        return result;
    }
}
