# MAXCONSECU - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T19:55:01.246Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- > 0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();            
            }
            int min=Integer.MAX_VALUE;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
                if(a[i]<min){
                    min=a[i];
                }
            }
            System.out.println((sum-min));
            
            //int sum=0;
            //for(int i=0;i<n;i++){
              //  sum+=a[i]
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXCONSECU)