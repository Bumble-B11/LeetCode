package leetcode17;

import java.util.*;

/**
 * Created by bumblebee on 2019/11/16.
 * 返回电话号码的字母组合
 */
public class LeetCode17 {

    private Map<Character, List<Character>> mMap = new HashMap<>();

    {
        initMap('2', "abc");
        initMap('3', "def");
        initMap('4', "ghi");
        initMap('5', "jkl");
        initMap('6', "mno");
        initMap('7', "pqrs");
        initMap('8', "tuv");
        initMap('9', "wxyz");
    }

    private List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new LeetCode17().letterCombinations("1234").toString());
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        letterCombinations(digits, new char[digits.length()], 0);
        return result;
    }

    private void letterCombinations(String digits, char[] array, int begin) {
        if (begin == array.length) {
            result.add(String.valueOf(array));
            return;
        }

        List<Character> set = mMap.get(digits.charAt(begin));

        if (set == null) {
            return;
        }
        for (int i = 0; i < set.size(); i ++) {
            array[begin] = set.get(i);
            letterCombinations(digits, array, begin + 1);
        }
    }

    private void initMap(char c, String value) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < value.length(); i ++) {
            list.add(value.charAt(i));
        }
        mMap.put(c, list);
    }
}
