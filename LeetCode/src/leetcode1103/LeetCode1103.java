package leetcode1103;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/7/3.
 */
public class LeetCode1103 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode1103().distributeCandies(10, 3)));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;
        int countPerDistribute = 1;
        while (candies > 0) {
            if (countPerDistribute > candies) {
                countPerDistribute = candies;
            }
            result[index % num_people] += countPerDistribute;
            index ++;
            candies -= countPerDistribute;
            countPerDistribute ++;
        }
        return result;
    }
}
