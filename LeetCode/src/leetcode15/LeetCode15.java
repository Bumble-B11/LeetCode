package leetcode15;

import java.util.*;

public class LeetCode15 {

    public static void main(String[] args) {
        List<List<Integer>> result = new LeetCode15().threeSum(new int[]{0,0,0});

        for (List<Integer> arr : result) {
            System.out.println(Arrays.toString(arr.toArray()));
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        List<List<Integer>> result = new ArrayList<>();
        int currentK = 0;
        for (; k <= nums.length - 3 && nums[k] <= 0; k ++) {
            if (k != 0 && currentK == nums[k]) {
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                if (nums[k] + nums[i] + nums[j] < 0) {
                    int currentI = nums[i];
                    while (i < j && nums[i] == currentI) {
                        i ++;
                    }
                    continue;
                }

                if (nums[k] + nums[i] + nums[j] > 0) {
                    int currentJ = nums[j];
                    while (i < j && nums[j] == currentJ) {
                        j --;
                    }
                    continue;
                }

                if (nums[k] + nums[i] + nums[j] == 0) {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[k]);
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    result.add(arr);

                    int currentI = nums[i];
                    while (i < j && nums[i] == currentI) {
                        i ++;
                    }

                    int currentJ = nums[j];
                    while (i < j && nums[j] == currentJ) {
                        j --;
                    }
                }
            }

            currentK = nums[k];
        }
        return result;
    }
}
