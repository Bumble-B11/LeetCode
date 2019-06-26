# LeetCode811
#### 题目描述
形如"www.baidu.com"这个域名，com是顶级域名，baidu.com是其下一级域名，www.baidu.com则是最低一级域名。如果访问一次www.baidu.com，则baidu.com和com这两个域名也会分别被访问一次。现给定一些域名及访问次数，求出所有子域名的访问次数。
#### 输入、输出示例
Example 1:

Input: 
["9001 discuss.leetcode.com"]

Output: 
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]

Example 2:

Input: 
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]

Output: 
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]

#### 解题思路
很常规的一道题，没什么套路。把所有的子域名找出来，将子域名和访问次数存进一个map中，最后遍历取出即可。