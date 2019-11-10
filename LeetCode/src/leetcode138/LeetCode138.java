package leetcode138;

import data.ComplexListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bumblebee on 2019/11/10.
 * 给定一个链表，每个节点包含一个额外增加的随机指针，
 * 该指针可以指向链表中的任何节点或空节点。要求返回这个链表的深拷贝。
 */
public class LeetCode138 {
    public static void main(String[] args) {

    }

    public ComplexListNode copyRandomList(ComplexListNode head) {
        if (head == null) {
            return null;
        }

        ComplexListNode cur = head;


        while (cur != null) {
            ComplexListNode node = new ComplexListNode();
            node.val = cur.val;
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        cur = head;
        while (cur != null) {
            ComplexListNode node = cur.next;
            if (cur.random != null) {
                node.random = cur.random.next;
            }
            cur = node.next;
        }

        ComplexListNode copyHead = new ComplexListNode();
        ComplexListNode copyCur = copyHead;
        cur = head;
        while (cur != null) {
            ComplexListNode node = cur.next;
            copyCur.next = node;
            cur.next = node.next;
            cur = cur.next;
            copyCur = copyCur.next;
        }

        return copyHead.next;
    }

    /*public ComplexListNode copyRandomList(ComplexListNode head) {
        if (head == null) {
            return null;
        }

        ComplexListNode cur = head;
        ComplexListNode pre = null;

        Map<ComplexListNode, ComplexListNode> map = new HashMap<>();

        while (cur != null) {
            ComplexListNode node = new ComplexListNode();
            node.val = cur.val;
            map.put(cur, node);
            if (pre != null) {
                pre.next = node;
            }
            pre = node;
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            ComplexListNode node = map.get(cur);
            if (node == null) {
                continue;
            }
            node.random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }*/
}
