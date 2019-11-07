package leetcode33;

/**
 * Created by bumblebee on 2019/11/7.
 */
public class LeetCode33 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3};
        System.out.println(new LeetCode33().search(arr, 2));
    }

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (left < right) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[left] < nums[middle]) {
                if (target > nums[left] && target < nums[middle]) {
                    right = middle - 1;
                    continue;
                }
                left = middle + 1;
                continue;
            } else {
                if (target > nums[middle] && target < nums[right]) {
                    left = middle + 1;
                    continue;
                }
                right = middle - 1;
            }
        }
        return target == nums[middle] ? middle : -1;
    }
}
