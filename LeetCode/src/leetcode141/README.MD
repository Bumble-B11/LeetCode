# LeetCode141
#### 题目描述
判断一个链表中是否有环
#### 输入、输出示例
Example 1:
> Input: head = [3,2,0,-4], pos = 1

> Output: true

#### 解题思路
方案1
使用一个哈希表存储已经遍历过的节点，当没有走到表尾时，如果发现当前指向的节点在哈希表中已经存在，那么一定形成了环结构

方案2
使用快慢指针，当快指针没有走到表尾时，如果他追上了慢指针，那么一定行程环结构。
