package leetcode561;

/**
 * Created by bumblebee on 2019/1/30.
 *
 */
public class LeetCode561 {

    public static void main(String[] args) {
        System.out.println(new LeetCode561().arrayPairSum(new int[]{1,2,3,2}));
    }

    public int arrayPairSum(int[] nums) {
        /*Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1;) {
            sum += nums[i];
            i += 2;
        }
        return sum;*/
        int sum = 0;
        int[] bucket = new int[20001];
        for (int i = 0; i < nums.length; i ++) {
            bucket[nums[i] + 10000] ++;
        }

        boolean isAdded = true;
        for (int i = 0; i < 20001; i ++) {
            while (bucket[i] -- > 0) {
                if (isAdded) {
                    sum += i - 10000;
                }
                isAdded = !isAdded;
            }
        }
        return sum;
    }
}
