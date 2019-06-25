package leetcode883;

import java.util.HashSet;
import java.util.Set;

public class LeetCode883 {
    public static void main(String[] args) {
        int[][] grid =  {
                {19,4,3,20,17,7,18,16,10,8,0,12,5,19,3},
                {0,14,17,0,2,18,16,17,15,8,1,11,12,4,9},
                {9,9,0,15,18,13,4,3,4,5,8,1,5,5,16},
                {16,0,17,14,1,17,16,20,13,4,18,6,0,3,12},
                {8,17,20,13,14,14,15,10,4,20,9,16,3,1,16},
                {18,1,12,10,6,17,5,10,3,15,9,9,14,2,19},
                {19,15,15,12,11,16,10,0,14,11,3,17,3,7,2},
                {3,3,0,0,7,0,20,12,13,12,6,5,6,15,0},
                {4,19,14,12,1,20,18,17,2,0,1,7,18,9,15},
                {4,1,6,3,1,14,20,3,19,2,18,8,15,20,2},
                {6,7,7,5,4,4,15,10,18,0,2,18,4,8,11},
                {2,10,20,14,5,16,16,11,18,15,8,19,20,12,5},
                {19,0,3,16,5,9,13,11,3,12,16,6,11,20,13},
                {6,18,2,13,10,8,7,4,8,7,17,1,7,3,18},
                {2,16,3,15,17,16,13,7,8,14,11,17,14,6,9}
        };
        System.out.println(new LeetCode883().projectionArea(grid));
    }

    public int projectionArea(int[][] grid) {
        int length = grid.length;
        Set<Integer> zeroSet = new HashSet<>();

        int xz = 0;
        int yz = 0;
        for (int i = 0; i < length; i ++) {
            int xzMax = 0;
            int yzMax = 0;
            for (int j = 0; j < length; j ++) {
                if (grid[i][j] > xzMax) {
                    xzMax = grid[i][j];
                }

                if (grid[j][i] > yzMax) {
                    yzMax = grid[j][i];
                }

                if (grid[i][j] == 0) {
                    zeroSet.add(i * 10 + j);
                }
            }
            xz += xzMax;
            yz += yzMax;
        }

        return xz + yz + length * length - zeroSet.size();
    }
}
