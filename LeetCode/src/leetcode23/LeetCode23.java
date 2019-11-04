package leetcode23;

/**
 * Created by bumblebee on 2019/11/4.
 */
public class LeetCode23 {

    public static void main(String[] args) {
        ListNode l1 = createList(new int[]{1, 4, 5});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode l3 = createList(new int[]{2, 6});

        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        ListNode head = new LeetCode23().mergeKLists(lists);

        System.out.println(head.val);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        ListNode[] listArray = new ListNode[lists.length % 2  == 0 ? lists.length / 2 : lists.length / 2 + 1];
        for (int index = 0; index < lists.length - 1; index += 2) {
            listArray[index / 2] = mergeTwoLists(lists[index], lists[index + 1]);
        }
        if (lists.length % 2 != 0) {
            listArray[listArray.length - 1] = lists[lists.length - 1];
        }

        return mergeKLists(listArray);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

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
}
