package utils;

import data.ListNode;

/**
 * Created by bumblebee on 2019/11/6.
 */
public class LinkedListUtils {
    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode preHead = new ListNode(0);
        ListNode head = preHead;
        for (int i : values) {
            head.next = new ListNode(i);
            head = head.next;
        }

        return preHead.next;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            return;
        }

        while (head != null) {
            System.out.printf("%d ", head.val);
            head = head.next;
        }
        System.out.println();
    }
}
