package leetcode973;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by bumblebee on 2019/1/31.
 */
public class LeetCode973 {

    public static void main(String[] args) {
        int[][] array = {{3,3},{5,-1},{-2,4}};
        int[][] result = new LeetCode973().kClosest(array, 2);
        for (int[] subResult : result) {
            System.out.println(Arrays.toString(subResult));
        }
    }

    public int[][] kClosest(int[][] points, int K) {
        Map<Integer, int[]> map = new TreeMap<>();
        for (int i = 0; i < points.length; i ++) {
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            map.put(distance, points[i]);
        }

        int[][] result = new int[K][2];
        int i = 0;
        for (int ket : map.keySet()) {
            if (i == K) {
                break;
            }
            result[i] = map.get(ket);
            i ++;
        }
        return result;
    }
}
