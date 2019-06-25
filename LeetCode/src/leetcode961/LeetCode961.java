package leetcode961;

/**
 * Created by bumblebee on 2019/1/26.
 */
public class LeetCode961 {

    public static void main(String[] args) {
        System.out.println(new LeetCode961().repeatedNTimes(new int[]{5,1,1,2,5,3,5,5}));
    }

    public int repeatedNTimes(int[] A) {

        /*int max = 0;
        for (int i : A) {
            if (i > max) {
                max = i;
            }
        }
        int[] array = new int[max + 1];

        for (int i : A) {
            array[i] ++;
        }
        *//**//*
        int maxIndex = 0;
        max = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;*/
        /*Set<Integer> B = new HashSet<>();

        for(int i : A) {

            if(B.contains(i))
                return i;
            else
                B.add(i);

        }//for

        return -1;*/
        int max = 0;
        for (int i : A) {
            if (i > max) {
                max = i;
            }
        }
        int[] array = new int[max + 1];
        int N = A.length / 2;

        for (int i : A) {
            array[i] ++;
            if (array[i] == N) {
                return i;
            }
        }
        return -1;
    }
}
