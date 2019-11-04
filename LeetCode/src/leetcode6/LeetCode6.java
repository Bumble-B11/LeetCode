package leetcode6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/1.
 */
public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(new LeetCode6().convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuffer> rowStrings = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i ++) {
            rowStrings.add(new StringBuffer());
        }
        char[] chars = s.toCharArray();
        int index = 0;
        int i = 0;
        boolean down = true;
        for (char c : chars) {
            rowStrings.get(index).append(c);
            index += down ? 1 : -1;
            if (index == 0 || index == numRows - 1) {
                down = !down;
            }

        }
        StringBuffer stringBuffer = new StringBuffer();
        for (StringBuffer sb : rowStrings) {
            stringBuffer.append(sb);
        }
        return stringBuffer.toString();
    }
}
