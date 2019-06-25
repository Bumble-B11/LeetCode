package leetcode709;

/**
 * Created by bumblebee on 2019/1/26.
 */
public class LeetCode709 {

    public static void main(String[] args) {
        System.out.println(new LeetCode709().toLowerCase("Hello"));
    }

    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i ++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
    }
}
