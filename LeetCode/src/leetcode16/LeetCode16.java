package leetcode16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode16 {

    public static void main(String[] args) {
        System.out.println(new LeetCode16().threeSumClosest(new int[]{1,1,1,1}, 0));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int k = 0;
        int currentK = 0;
        int MIN_DIFF = Integer.MAX_VALUE;
        int result = 0;
        for (; k <= nums.length - 3; k ++) {
            if (k != 0 && currentK == nums[k]) {
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                int diff = nums[k] + nums[i] + nums[j] - target;
                if (Math.abs(diff) < MIN_DIFF) {
                    MIN_DIFF = Math.abs(diff);
                    result = nums[k] + nums[i] + nums[j];
                }
                if (diff < 0) {
                    int currentI = nums[i];
                    while (i < j && nums[i] == currentI) {
                        i ++;
                    }
                    continue;
                }

                if (diff > 0) {
                    int currentJ = nums[j];
                    while (i < j && nums[j] == currentJ) {
                        j --;
                    }
                    continue;
                }
                return target;
            }

            currentK = nums[k];
        }
        return result;
    }
}
