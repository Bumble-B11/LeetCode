# LeetCode112
#### 题目描述
给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
#### 输入、输出示例
Example 1:
> Input: [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1]

> Output: true

#### 解题思路
这里要求的是从根节点到叶子节点的路径，所以在遍历二叉树的时候应该选择前序遍历的方式。
因为前序遍历第一个访问的节点是根节点。
每次访问一个节点，执行如下几个步骤：
1. 当前节点是否为空
2. 要求的和sum减去当前节点的值
3. 当前节点是否为叶子节点
4. 判断sum是否为0，如果是，则直接return true
5. 如果不是叶子节点，则判断左子树或者右子树是否和为sum