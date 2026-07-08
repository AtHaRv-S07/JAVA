# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.98%)  
**Memory:** 42.6 MB (beats 63.60%)  
**Submitted:** 2026-07-08T10:25:38.643Z  

```java
class Solution {
    public int reverse(int x) {
        int sum = 0, p,n;
        
        while (x != 0) {
            p = x % 10;
            x = x / 10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
            }

            sum = sum * 10 + p;
        }
        return sum;
    }

}

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)