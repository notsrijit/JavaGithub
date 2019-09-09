import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(),s,p;
        for(int i=1;i<=t;i++){
            s=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j<n; j++){
                    p=(int)Math.pow(2,j);
                    s=s+(p*b);
                    System.out.print(a+s+" ");
            }
            System.out.println();    
        }
        in.close();
    }
}

