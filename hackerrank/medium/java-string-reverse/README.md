# Java Substring Comparisons

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.  

***
Given a string $A$, print ``Yes`` if it is a palindrome, print ``No`` otherwise. 


**Input Format**

 

**Constraints**

* $A$ will consist at most $50$ lower case english letters.

**Output Format**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-27T19:28:34.940Z  

```cpp

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int l=s.length();
        for(int i=1;i<s.length()-k+1;i++)
        {
            String current=s.substring(i,i+k);
            
            if(current.compareTo(smallest)<0){
                smallest=current;
            }
            
            if(current.compareTo(largest)>0){
                largest=current;
            }
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }



```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-reverse/problem)