package leetcode233;

/**
 * Created by bumblebee on 2019/11/11.
 * 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 */
public class LeetCode233 {

    public static void main(String[] args) {
        System.out.println(new LeetCode233().countDigitOne(1410065408));
    }

    public int countDigitOne(long n) {
        if (n <= 0) {
            return 0;
        }
        long digitCapacity = getDigitCapacity(n);
        long sum = n / 10 + (n % 10 == 0 ? 0 : 1);
        for (long index = 2; index <= digitCapacity; index ++) {
            sum += getCountOf1ByDigit(n, index);
        }

        return (int)sum;
    }


    private long getCountOf1ByDigit(long n, long digit) {
        if (digit < 2) {
            return 0;
        }

        long power = (long)Math.pow(10, digit);
        return (n / power * (power / 10)) + Math.min(Math.max(n % power - power / 10 + 1, 0), power / 10);
    }

    private long getDigitCapacity(long n) {
        long result = 1;
        while (n / 10 > 0) {
            result ++;
            n /= 10;
        }

        return result;
    }
}
