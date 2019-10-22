# LeetCode1030
#### 题目描述
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
#### 输入、输出示例
Example 1:
> Input: nums = [2, 7, 11, 15], target = 9

> Output: [0, 1]

#### 解题思路
使用一个HashMap，以nums的值作为key，下标作为value。遍历数组，将寻找两个数加起来等于target的问题转换为查找(target - 当前数字)是否存在。这里使用HashMap的containsKey方法。找到之后输出对应的下标即可。
