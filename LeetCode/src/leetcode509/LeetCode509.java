package leetcode509;

/**
 * Created by bumblebee on 2019/2/10.
 */
public class LeetCode509 {

    public static void main(String[] args) {
        System.out.println(new LeetCode509().fib(2));
    }

    public int fib(int N) {
        int[] results = new int[N + 1];

        for (int i = 0; i < N + 1; i ++) {
            if (i == 0) {
                results[i] = 0;
            } else if (i == 1) {
                results[i] = 1;
            } else
                results[i] = results[N - 1] + results[N - 2];
        }

        return results[N];
    }
}
