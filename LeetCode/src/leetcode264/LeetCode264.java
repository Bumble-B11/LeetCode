package leetcode264;

/**
 * Created by bumblebee on 2019/11/12.
 * 编写一个程序，找出第 n 个丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 */
public class LeetCode264 {

    public static void main(String[] args) {
        System.out.println(new LeetCode264().nthUglyNumber(10));
    }

    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] result = new int[n];
        result[0] = 1;
        int nextIndex = 1;

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        while (nextIndex < n) {
            result[nextIndex] = Math.min(Math.min(result[p2] * 2, result[p3] * 3), result[p5] * 5);

            while (result[p2] * 2 <= result[nextIndex]) {
                p2 ++;
            }

            while (result[p3] * 3 <= result[nextIndex]) {
                p3 ++;
            }

            while (result[p5] * 5 <= result[nextIndex]) {
                p5 ++;
            }

            nextIndex ++;
        }

        return result[nextIndex - 1];
    }
}
