package leetcode461;

/**
 * Created by bumblebee on 2019/1/29.
 */
public class LeetCode461 {
    public static void main(String[] args) {
        System.out.println(new LeetCode461().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int i = 0;
        int count = 0;
        /*int xI = 0;
        while (x >> xI != 0) {
            System.out.print((x >> xI & 1) + " ");
            xI ++;
        }
        System.out.println();
        int yI = 0;
        while (y >> yI != 0) {
            System.out.print((y >> yI & 1) + " ");
            yI ++;
        }
        System.out.println();*/
        /*while (x >> i != 0 || y >> i != 0) {
            if (((x >> i & 1) ^ (y >> i & 1)) == 1) {
                count ++;
            }
            i ++;
        }*/
        /*int value = x ^ y;
        while (value >> i != 0) {
            if (((value >> i) & 1) == 1) {
                count ++;
            }
            i ++;
        }*/
        int num = 255;
        while(num!=0){
            count++;
            num=num&(num-1);
        }
        return count;
    }
}
