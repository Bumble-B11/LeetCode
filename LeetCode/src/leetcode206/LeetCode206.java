package leetcode206;

import data.ListNode;
import utils.LinkedListUtils;

/**
 * Created by bumblebee on 2019/11/8.
 */
public class LeetCode206 {
    public static void main(String[] args) {
        ListNode head = LinkedListUtils.createList(new int[]{1, 2});
        LinkedListUtils.printList(new LeetCode206().reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
