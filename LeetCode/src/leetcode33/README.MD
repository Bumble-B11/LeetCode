# LeetCode33
#### 题目描述
假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

你可以假设数组中不存在重复的元素。

你的算法时间复杂度必须是 O(log n) 级别。
#### 输入、输出示例
Example 1:
> Input: nums = [4,5,6,7,0,1,2], target = 0

> Output: 4

> Input: nums = [4,5,6,7,0,1,2], target = 3

> Output: -1

#### 解题思路
旋转数组的特点是一定是由两个递增的数组组成的。可以使用二分查找的思路。
先将左右指针指向数组的左右边界，计算其middle。如果这三个指针指向的元素和target相等，则直接返回。
首先有这样一个结论：要么left到middle这一段是递增的，要么middle到right这一段是递增的。
那么我们就分类讨论，如果left到middle这一段递增，则判断target是否在这个范围中(是否满足nums[left] < target < nums[middle])。
- 如果在，则将右指针指向当前middle的前一个元素
- 如果不在，则将左指针指向middle的后一个元素。
如果middle到right这一段递增，同理：是否满足nums[middle] < target < nums[right]
