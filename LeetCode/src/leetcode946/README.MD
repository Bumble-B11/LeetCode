# LeetCode946
#### 题目描述
给定 pushed 和 popped 两个序列，每个序列中的 值都不重复，
只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，
返回 true；否则，返回 false 。

#### 输入、输出示例
Example 1:
> Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]

> Output: true

> Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]

> Output: false

#### 解题思路
遍历popped数组，如果当前元素和栈顶元素不相等，则将pushed中的元素压栈，直到
栈顶元素和当前元素相同时，将栈顶元素pop，如果pushed剩余元素没有和popper当前元素相等的，
则说明该序列不可能是栈的弹出序列
