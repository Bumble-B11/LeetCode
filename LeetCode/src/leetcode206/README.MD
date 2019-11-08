# LeetCode206
#### 题目描述
反转一个单链表。

你的算法时间复杂度必须是 O(log n) 级别。
#### 输入、输出示例
Example 1:
> Input: 1->2->3->4->5->NULL

> Output: 5->4->3->2->1->NULL


#### 解题思路
用三个辅助指针，分别指向前一个(pre)，当前(cur)和下一个(next)。
1. next = cur.next
2. cur.next = pre
3. pre = cur
4. cur = next

