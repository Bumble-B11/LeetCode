package leetcode179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/12.
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 */
public class LeetCode179 {

    public static void main(String[] args) {
        System.out.println(new LeetCode179().largestNumber(new int[]{
                0, 0
        }));
    }

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        List<StringWrapper> wrapperList = new ArrayList<>(nums.length);

        for (int num : nums) {
            wrapperList.add(new StringWrapper(num));
        }

        Collections.sort(wrapperList);

        StringBuilder sb = new StringBuilder();
        for (StringWrapper wrapper : wrapperList) {
            sb.append(wrapper.data);
        }

        int i = 0;
        for (; i < sb.length(); i ++) {
            if (sb.charAt(i) == '0') {
                continue;
            }
            break;
        }
        String result = sb.toString().substring(i);
        return result.isEmpty() ? "0" : result;
    }

    class StringWrapper implements Comparable<StringWrapper> {
        String data;

        @Override
        public int compareTo(StringWrapper o) {
            return -(data + o.data).compareTo(o.data + data);
        }

        public StringWrapper(int data) {
            this.data = String.valueOf(data);
        }
    }
}
