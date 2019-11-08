package leetcode141;

import data.ListNode;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null || head.next.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == slow) {
                return true;
            }

            if (fast == null) {
                return false;
            }

            fast = fast.next;
            if (fast == slow) {
                return true;
            }

            slow = slow.next;
        }
        return false;
    }
}
