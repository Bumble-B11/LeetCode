package leetcode804;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bumblebee on 2019/1/27.
 */
public class LeetCode804 {

    public static void main(String[] args) {
        int result = new LeetCode804().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(result);
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."
        };

        Set<String> result = new HashSet<>();

        for (String word : words) {
            int wordLength = word.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < wordLength; i ++) {
                sb.append(morseCode[(word.charAt(i) - 'a') % 26]);
            }
            result.add(sb.toString());
        }
        return result.size();
    }
}
