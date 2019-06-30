package leetcode1047;

/**
 * Created by bumblebee on 2019/6/30.
 */
public class LeetCode1047 {

    public static void main(String[] args) {
        System.out.println(new LeetCode1047().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String S) {
        if (S.length() <= 1) {
            return S;
        }
        int index = 1;
        int length = S.length();
        while (index < length) {
            if (index == 0) {
                index ++;
                continue;
            }
            if (S.charAt(index) == S.charAt(index - 1)) {
                if (index == length - 1) {
                    S = S.substring(0, index - 1);
                    break;
                }
                S = S.substring(0, index - 1) + S.substring(index + 1);
                length = S.length();
                index = index - 1;
                continue;
            }
            index ++;
        }
        return S;
    }

    /*public String removeDuplicates(String s) {
        char [] word = s.toCharArray();
        int index = -1;
        for(int x = 0 ; x < word.length; x++){
            if(index >= 0 && word[x] == word[index]){
                index--;
            }
            else{
                word[++index] = word[x];
            }

        }

        return new String(word , 0, index+1);
    }*/
}
