package leetcode21;

/**
 * Created by bumblebee on 2019/11/4.
 */
public class LeetCode21 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    cur = cur.next;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                    l2 = l2.next;
                }
                continue;
            }

            if (l1 != null) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
                continue;
            }

            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }

        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
