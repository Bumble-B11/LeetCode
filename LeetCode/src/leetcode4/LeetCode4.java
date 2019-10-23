package leetcode4;

/**
 * Created by bumblebee on 2019/10/23.
 */
public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2, 4, 6};
        System.out.println(new LeetCode4().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        boolean isOdd = (length1 + length2) % 2 == 1;

        int i = 0, j = 0;

        int times = (length1 + length2) / 2;
        int[] resultArray = new int[times + 1];
        int k = 0;
        for (; k < resultArray.length && i < nums1.length && j < nums2.length; k ++) {

            if (nums1[i] <= nums2[j]) {
                resultArray[k] = nums1[i];
                i ++;
            } else {
                resultArray[k] = nums2[j];
                j ++;
            }
        }

        if (k == resultArray.length) {
            if (isOdd) {
                return resultArray[resultArray.length - 1];
            }
            return (resultArray[resultArray.length - 1] + resultArray[resultArray.length - 2]) / 2.0f;
        }

        if (i < nums1.length) {
            for (; k < resultArray.length; k ++) {
                resultArray[k] = nums1[i];
                i ++;
            }
            if (isOdd) {
                return resultArray[resultArray.length - 1];
            }
            return (resultArray[resultArray.length - 1] + resultArray[resultArray.length - 2]) / 2.0f;
        } else {
            for (; k < resultArray.length; k ++) {
                resultArray[k] = nums2[j];
                j ++;
            }
            if (isOdd) {
                return resultArray[resultArray.length - 1];
            }
            return (resultArray[resultArray.length - 1] + resultArray[resultArray.length - 2]) / 2.0f;
        }
    }
}
