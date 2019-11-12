package leetcode160;

import data.ListNode;
import utils.LinkedListUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by bumblebee on 2019/11/12.
 */
public class LeetCode160 {

    public static void main(String[] args) {
        ListNode headA = LinkedListUtils.createList(new int[]{4,1,8,4,5});
        ListNode headB = LinkedListUtils.createList(new int[]{5,0,1,8,4,5});

        System.out.println(new LeetCode160().getIntersectionNode(headA, headB).val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = 0, lengthB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null || curB != null) {
            if (curA != null) {
                lengthA ++;
                curA = curA.next;
            }
            if (curB != null) {
                lengthB ++;
                curB = curB.next;
            }
        }

        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i ++) {
                headA = headA.next;
            }
        }

        if (lengthA < lengthB) {
            for (int i = 0; i < lengthB - lengthA; i ++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                stackA.push(headA);
                headA = headA.next;
            }
            if (headB != null) {
                stackB.push(headB);
                headB = headB.next;
            }
        }

        ListNode nodeA = null;
        ListNode nodeB = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            nodeA = stackA.pop();
            nodeB = stackB.pop();

            if (nodeA == nodeB) {
                continue;
            }

            break;
        }

        if (nodeA != nodeB) {
            return nodeA.next;
        }

        return nodeA;
    }*/

    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> bSet = new HashSet<>();

        while (headB != null) {
            bSet.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            if (bSet.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }*/
}
