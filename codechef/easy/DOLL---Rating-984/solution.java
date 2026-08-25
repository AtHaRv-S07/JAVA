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
        while(--T >= 0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int N1[]=new int[N];
            int c=0;
            for(int i=0;i<N;i++){
                N1[i]=sc.nextInt();
                if(N1[i]>K){
                    c++;
                }
            }
            System.out.println(c);
        }
	}
}
