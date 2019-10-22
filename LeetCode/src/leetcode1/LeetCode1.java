package leetcode1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by bumblebee on 2019/6/30.
 */
public class LeetCode1 {

    public static void main(String[] args) {
        int[] source = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(new LeetCode1().twoSum(source, 9)));
    }


    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < nums.length; i ++) {
            dictionary.put(nums[i], i);
        }

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            int value = target - nums[i];
            if (dictionary.containsKey(value) && i != dictionary.get(value)) {
                result[0] = i;
                result[1] = dictionary.get(value);
                break;
            }
        }

        return result;
    }
}
