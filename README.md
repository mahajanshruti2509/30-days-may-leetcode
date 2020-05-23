# 30-days-may-leetcode

|  Day  |  #    | Title               |  Time           |  Space           | Difficulty           | Notes                  | 
|-------|-------|-------------------- | --------------- | -----------------| ---------------   | --------------------------|
| 01 | 0278  |[First Bad Version](https://leetcode.com/problems/first-bad-version/)|O(logn)|O(1) |Easy| Binary search, Integer overflow            |
| 02 | 0771  |[Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)|O(m+n)  |O(n) |Easy| For each stone, check if it is a jewel.  |
| 03 | 0771  |[Ransom Note](https://leetcode.com/problems/jewels-and-stones/)|O(m+n)  |O(n) |Easy| Use hash table to keep count of magazine letters |
| 04 | 0476  |[Number Complement](https://leetcode.com/problems/number-complement/)|O(n)  |O(1) |Easy| Bitwise operators |
| 05 | 0387  |[First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)|O(n)  |O(n) |Easy| Create an empty array for 256 characters, directly increment the count based on ASCII |
| 06 | 0169  |[Majority Element](https://leetcode.com/problems/majority-element/solution/)|O(n)  |O(n) |Easy| Hash map |
| 07 | 0993  |[Cousins in Binary Tree](https://leetcode.com/problems/cousins-in-binary-tree/)|O(n)  |O(n) |Easy| Use linkedlist to do level-wise tracking, 2 hash maps for storing parent and level|
| 08 | 1232  |[Check if it a Straight Line](https://leetcode.com/problems/check-if-it-is-a-straight-line/)|O(n)  |O(1) |Easy| Slope = (y2-y1)/(x2-x1). If slope(line between point 1 and 2) is equal to slope(line between point 1 and n), points are in straight line. |
| 09 | 0367  |[Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)|O(n)  |O(1) |Easy| Binary search, For given number n, the squre root of n will always be between n and n/2 |
| 10 | 0997  |[Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)|O(n)  |O(n) |Easy| Use hash set for people who trust and hash map to keep trust votes count|
| 11 | 0733  |[Flood Fill](https://leetcode.com/problems/flood-fill/)|O(n)  |O(n) |Easy| Depth first search approach, similar to number of islands problem|
| 12 | 0540  |[Single Element in Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)|O(logn)  |O(1) |Medium| First occurrence of every element is found at even index. Tweak start and end by checking if mid is even or odd|
| 13 | 0402  |[Remove K Digits](https://leetcode.com/problems/remove-k-digits/)|O(n)  |O(n) |Medium| Use stack to traverse the number from left to right|
| 14 | 0208  |[Implement Trie(Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)|O(n)  |O(n) |Medium| |
| 15 | 0918  |[Maximum Sum Circular Subarray](https://leetcode.com/problems/maximum-sum-circular-subarray/)|O(n)  |O(1) |Medium| Modified Kadane's algorithm |
| 16 | 0328  |[Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)|O(n)  |O(1) |Medium||
| 17 | 0438  |[Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)|O(n)  |O(n) |Medium|Sliding window approach|
| 18 | 0567  |[Permutation in String](https://leetcode.com/problems/permutation-in-string/)|O(n)  |O(1) |Medium|Sliding window approach|
| 19 | 0901  |[Online Stock Spanner](https://leetcode.com/problems/online-stock-span/)|O(n)  |O(n) |Medium| Use 2 hash maps to track stock prices and stock span|
| 20 | 0230  |[Kth Smallest Element](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)|O(H+k)  |O(H+k) |Medium| Use the property of BST : inorder traversal of BST is an array sorted in the ascending order.|
| 22 | 0451  |[Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)|O(n)  |O(n) |Medium| Use hash map to keep frequency count and priority queue as max heap|

