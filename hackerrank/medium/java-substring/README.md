# Java Strings Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, and two indices, $start$ and $end$, print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from $start$ to $end-1$. You'll find the *String* class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge. 

**Input Format**

The first line contains a single string denoting $s$.		
The second line contains two space-separated integers denoting the respective values of $start$ and $end$.

**Constraints**

* $1 \le |s| \le 100$
* $0 \le start \lt end \le n$
- String $s$ consists of English alphabetic letters (i.e., $[a-zA-Z]$) only.

**Output Format**

Print the substring in the inclusive range from $start$ to $end-1$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-27T11:46:19.510Z  

```cpp
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1=A.length();
        int l2=B.length();
        System.out.println(l1+l2);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char c1=Character.toUpperCase(A.charAt(0));
        char c2=Character.toUpperCase(B.charAt(0));
        String A1=c1 + A.substring(1);
        String B1=c2 + B.substring(1);
        System.out.println(A1+" "+B1);
        
   }
}




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-substring/problem)