package leetcode728;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/1/30.
 */
public class LeetCode728 {

    public static void main(String[] args) {
        System.out.println(new LeetCode728().selfDividingNumbers(1, 22).toString());
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i ++) {
            if (isDivideNum(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isDivideNum(int originNum) {
        if (originNum < 10) {
            return true;
        }
        int num = originNum;
        while (num > 0) {
            int temp = num % 10;
            if (temp == 0 || originNum % temp != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
