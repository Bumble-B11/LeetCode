package leetcode557;

public class LeetCode557 {

    public static void main(String[] args) {
        System.out.println(new LeetCode557().reverseWords("Let's take LeetCode contest"));
    }

    /*public String reverseWords(String s) {
        String[] sArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String st : sArray) {
            result.append(reverseWord(st)).append(" ");
        }
        return result.toString().substring(0, result.length() - 1);
    }

    public String reverseWord(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i ++) {
            char c = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = c;
        }
       return String.valueOf(chars);
    }*/
    public String reverseWords(String s) {
        char[] charsArray = s.toCharArray();
        int left = 0;
        int right = s.indexOf(" ");
        while (right != -1) {
            reverseWord(charsArray, left, right - 1);
            left = right + 1;
            right = s.indexOf(" ", left);
        }
        reverseWord(charsArray, left, s.length() - 1);
        return String.valueOf(charsArray);
    }

    public void reverseWord(char[] chars, int left, int right) {
        while (left < right) {
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            left ++;
            right --;
        }
        /*for (int i = left; i < (right - left) / 2 + left; i ++) {
            char c = chars[i];
            chars[i] = chars[right  + left - 1 - i];
            chars[right + left - 1 - i] = c;
        }*/
    }
}
