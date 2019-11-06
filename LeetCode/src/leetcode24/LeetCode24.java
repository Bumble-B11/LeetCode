package leetcode24;

import data.ListNode;
import utils.LinkedListUtils;

/**
 * Created by bumblebee on 2019/11/6.
 */
public class LeetCode24 {

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtils.createList(new int[]{1});
        LinkedListUtils.printList(new LeetCode24().swapPairs(l1));
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre;
        ListNode fir = head;
        ListNode sec = head.next;
        if (sec == null) {
            return head;
        }

        fir.next = sec.next;
        sec.next = fir;
        head = sec;
        pre = fir;
        fir = fir.next;
        if (fir == null) {
            return head;
        }
        sec = fir.next;

        while (fir.next != null) {
            fir.next = sec.next;
            sec.next = fir;
            pre.next = sec;
            pre = fir;
            fir = fir.next;
            if (fir == null) {
                break;
            }
            sec = fir.next;
        }

        return head;
    }
}
