package leetcode19;

public class LeetCode19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 0; i < 2; i ++) {
            cur.next = new ListNode(i + 1);
            cur = cur.next;
        }
        head = head.next;
        head = new LeetCode19().removeNthFromEnd(head, 2);
        System.out.println(head.val);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = slow;
        int index = 0;
        for (; index < n - 1 && fast != null; index ++) {
            fast = fast.next;
        }

        if (fast == null) {
            return null;
        }

        ListNode pre = slow;
        while (fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == head) {
            return slow.next;
        }

        pre.next = slow.next;

        return head;
    }
}
