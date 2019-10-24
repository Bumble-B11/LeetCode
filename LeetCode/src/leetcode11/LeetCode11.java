package leetcode11;

public class LeetCode11 {

    public static void main(String[] args) {
        System.out.println(new LeetCode11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    /*public int maxArea(int[] height) {
        int maxValue = 0;
        for (int i = 0; i < height.length; i ++) {
            for (int j = i + 1; j < height.length; j ++) {
                int minHeight = Math.min(height[i], height[j]);
                int area = minHeight * (j - i);
                if (maxValue < area) {
                    maxValue = area;
                }
            }
        }
        return maxValue;
    }*/

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxValue = 0;
        while (i < j) {
            int currentValue = Math.min(height[i], height[j]) * (j - i);
            if (maxValue < currentValue) {
                maxValue = currentValue;
            }
            if (height[i] <= height[j]) {
                i ++;
            } else {
                j --;
            }
        }
        return maxValue;
    }
}
