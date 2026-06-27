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



