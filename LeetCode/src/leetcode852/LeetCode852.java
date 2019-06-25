package leetcode852;

/**
 * Created by bumblebee on 2019/1/30.
 */
public class LeetCode852 {

    public static void main(String[] args) {
        System.out.println(new LeetCode852().peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }

    public int peakIndexInMountainArray(int[] A) {
        /*for (int i = 1; i < A.length - 1; i ++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                return i;
            }
        }
        return -1;*/
        int left = 1;
        int right = A.length - 2;
        int mid;
        while (left + 1 < right) {
            mid = left + ((right - left) / 2);
            if (A[mid] > A[mid + 1]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return A[left] > A[right] ? left : right;
    }
}
