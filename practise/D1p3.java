import java.util.*;
import java.lang.*;
import java.io.*;

class D1p3
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T, i, j, n, c, s;
        T=sc.nextInt();
        for(i=1 ;i<=T; i++)
        {
            n=sc.nextInt();
            int a[]=new int [n];
            for(j=0; j<n; j++)
            {
                a[j]=sc.nextInt();
            }
            c=1; s=0;
            for(j=0; j<n; j++)
            {
                if(a[j]==1)
                {
                    s=s+1;
                }
                else
                {
                    s=s-1;
                }
                if(s<0)
                {
                    c=0;
                    break;
                }
            }
            if(c==0)
                System.out.println("Invalid");
            else
                System.out.println("Valid");
        }
        sc.close();
    }
}