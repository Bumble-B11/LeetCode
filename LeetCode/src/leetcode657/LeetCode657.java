package leetcode657;

/**
 * Created by bumblebee on 2019/1/27.
 */
public class LeetCode657 {

    public static void main(String[] args) {
        System.out.println(new LeetCode657().judgeCircle("UD"));
    }

    public boolean judgeCircle(String moves) {
        int[] step = new int[4];
        for (int i = 0; i < moves.length(); i ++) {
            char c = moves.charAt(i);
            step[stepToInt(c)] ++;
        }
        return step[0] == step[1] && step[2] == step[3];
    }

    private int stepToInt(char c) {
        switch (c) {
            case 'L':
                return 0;
            case 'R':
                return 1;
            case 'U':
                return 2;
            case 'D':
                return 3;
        }
        return -1;
    }
}
