package leetcode876;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/6/30.
 */
public class LeetCode876 {
    /**
     * 遍历求长度解法
     * */
    /*public ListNode middleNode(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode last = head;
        listNodes.add(last);
        while (last.next != null) {
            last = last.next;
            listNodes.add(last);
        }
        int size = listNodes.size();
        if (size % 2 == 0) {
            return listNodes.get(size / 2);
        }
        return listNodes.get(size / 2 - 1);
    }*/

    /**
     * 快慢指针解法
     * */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null) {
            slow = slow.next;
            if (fast.next.next != null) {
                fast = fast.next.next;
            } else {
                break;
            }
        }
        return slow;
    }
}
