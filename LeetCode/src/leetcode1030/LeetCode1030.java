package leetcode1030;

import java.util.*;

/**
 * Created by bumblebee on 2019/6/26.
 */
public class LeetCode1030 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode1030().allCellsDistOrder(1, 2, 0, 0)));
    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<Coordinate> distanceList = new ArrayList<>();
        for (int i = 0; i < R; i ++) {
            for (int j = 0; j < C; j ++) {
                Coordinate coordinate = new Coordinate();
                coordinate.distance = Math.abs(i - r0) + Math.abs(j - c0);
                coordinate.x = i;
                coordinate.y = j;
                distanceList.add(coordinate);
            }
        }

        distanceList.sort(new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                if (o1.distance > o2.distance) {
                    return 1;
                }
                if (o1.distance < o2.distance) {
                    return -1;
                }
                return 0;
            }
        });

        int[][] result = new int[distanceList.size()][2];
        for (int i = 0; i < distanceList.size(); i ++) {
            result[i][0] = distanceList.get(i).x;
            result[i][1] = distanceList.get(i).y;
        }
        return result;
    }
}
