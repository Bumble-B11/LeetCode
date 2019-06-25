package leetcode905;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/1/27.
 */
public class LeetCode905 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode905().sortArrayByParity(new int[]{3,1,2,4})));
    }

    public int[] sortArrayByParity(int[] A) {
        /*boolean firstOdd = false;
        LinkedList<Integer> linkedList = new LinkedList<>();
        int length = A.length;
        int firstOddIndex = 0;
        for (int index = 0; index < length; index ++) {

            if (A[index] % 2 == 0) {
                linkedList.add(firstOddIndex, A[index]);
            } else {
                linkedList.add(A[index]);
                if (!firstOdd) {
                    firstOdd = true;
                    firstOddIndex = index;
                }
            }

        }
        int[] result = new int[linkedList.size()];
        for (int i = 0; i < A.length; i ++) {
            result[i] = linkedList.get(i);
        }
        return result;*/
        /*ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int a : A) {
            if (a % 2 == 0) {
                evenList.add(a);
            } else {
                oddList.add(a);
            }
        }
        evenList.addAll(oddList);
        int[] result = new int[evenList.size()];
        for (int i = 0; i < A.length; i ++) {
            result[i] = evenList.get(i);
        }
        return result;*/
        /*int[] result = new int[A.length];
        int length = A.length - 1;
        int j = 0;
        for (int i = 0; i < A.length; i ++) {
            if (A[i] % 2 == 0) {
                result[j] = A[i];
                j ++;
            } else {
                result[length] = A[i];
                length --;
            }
        }
        return result;*/
        /*定义头部指针*/
        Node head = new Node();
        Node firstOddNode = null;
        int length = A.length;
        for (int aA : A) {
            Node node = new Node();
            node.setData(aA);
            if (aA % 2 == 0) {
                /*如果是偶数，则直接插入在头部后面*/
                node.setNext(head.getNext());
                head.setNext(node);
            } else {
                if (firstOddNode == null) {
                    /*如果第一个奇数未出现，则插入在表尾*/
                    Node point = head;
                    while (point.getNext() != null) {
                        /*遍历链表，获取表尾*/
                        point = point.getNext();
                    }
                    firstOddNode = node;
                    point.setNext(node);
                } else {
                    /*如果第一个奇数出现了，则插入在第一个奇数后*/
                    node.setNext(firstOddNode.getNext());
                    firstOddNode.setNext(node);
                }
            }
        }
        int[] result = new int[length];
        int i = 0;
        while (head.getNext() != null) {
            result[i] = head.getNext().getData();
            head = head.getNext();
            i ++;
        }
        return result;
    }
}
