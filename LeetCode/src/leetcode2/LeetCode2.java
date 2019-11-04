package leetcode2;

/**
 * Created by bumblebee on 2019/11/4.
 */
public class LeetCode2 {
    public static void main(String[] args) {
        ListNode l1Head;
        ListNode l1 = l1Head = new ListNode(5);
        /*l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1 = l1.next;*/

        ListNode l2Head;
        ListNode l2 = l2Head = new ListNode(5);
        /*l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;*/

        ListNode head = new LeetCode2().addTwoNumbers(l1Head, l2Head);
        System.out.println(head.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);

        if (l1 != null) {
            l1 = l1.next;
        }

        if (l2 != null) {
            l2 = l2.next;
        }

        ListNode head = new ListNode(val % 10);
        ListNode current = head;
        boolean isNeedCarry = val >= 10;

        int bitVal = 0;

        while (l1 != null && l2 != null) {
            bitVal = l1.val + l2.val + (isNeedCarry ? 1 : 0);
            current.next = new ListNode(bitVal % 10);
            isNeedCarry = bitVal >= 10;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null && isNeedCarry) {
            current.next = new ListNode(1);
            return head;
        }

        while (l1 != null) {
            bitVal = l1.val + (isNeedCarry ? 1 : 0);
            current.next = new ListNode(bitVal % 10);
            isNeedCarry = bitVal >= 10;
            current = current.next;
            l1 = l1.next;
        }

        if (isNeedCarry) {
            current.next = new ListNode(1);
        }

        while (l2 != null) {
            bitVal = l2.val + (isNeedCarry ? 1 : 0);
            current.next = new ListNode(bitVal % 10);
            isNeedCarry = bitVal >= 10;
            current = current.next;
            l2 = l2.next;
        }

        if (isNeedCarry) {
            current.next = new ListNode(1);
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
