package leetcode771;

/**
 * Created by bumblebee on 2019/1/24.
 */
public class LeetCode771 {

    public static void main(String[] args) {
        System.out.println(new LeetCode771().numJewelsInStones("z", "ZZ"));
    }

    private int numJewelsInStones(String J, String S) {
        if (J.length() == 0 || S.length() == 0) {
            return 0;
        }

        int jewelsCount = 0;

        for (int i = 0; i < S.length(); i ++) {
            char stone = S.charAt(i);
            if (J.contains(String.valueOf(stone))) {
                jewelsCount ++;
            }
        }
        return jewelsCount;
    }
}
