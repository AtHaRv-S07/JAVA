# Java Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, matching the regular expression `[A-Za-z !,?._'@]+`, split the string into *tokens*. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

**Note:** You may find the [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) method helpful in completing this challenge.

**Input Format**

A single string, $s$.

**Constraints**

- $1 \le \text{ length of } s \le 4 \cdot 10^5$
- $s$ is composed of *any* of the following: English alphabetic letters, blank spaces, exclamation points (`!`), commas (`,`), question marks (`?`), periods (`.`), underscores (`_`), apostrophes (`'`), and at symbols (`@`).

**Output Format**

On the first line, print an integer, $n$, denoting the number of tokens in string $s$ (they *do not* need to be unique). Next, print each of the $n$ tokens on a new line in the same order as they appear in input string $s$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-27T20:27:46.301Z  

```cpp


    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
    b = b.toLowerCase();

    // Step 1: Check lengths
    if (a.length() != b.length()) {
        return false;
    }

    // Step 2: Convert strings to character arrays
    char[] arr1 = a.toCharArray();
    char[] arr2 = b.toCharArray();

    // Step 3: Sort arr1 using Bubble Sort
    for (int i = 0; i < arr1.length - 1; i++) {
        for (int j = 0; j < arr1.length - 1 - i; j++) {
            if (arr1[j] > arr1[j + 1]) {
                char temp = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = temp;
            }
        }
    }

    // Step 4: Sort arr2 using Bubble Sort
    for (int i = 0; i < arr2.length - 1; i++) {
        for (int j = 0; j < arr2.length - 1 - i; j++) {
            if (arr2[j] > arr2[j + 1]) {
                char temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
            }
        }
    }

    // Step 5: Compare sorted arrays
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
    }

    return true;
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-tokens/problem)