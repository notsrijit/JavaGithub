import java.io.*;
import java.util.*;

class pattern1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int c=0;
        int a=0, b=1;

        for (int i=0; i<n-1; i++){

            for (int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print(c+"\t");
                a=b;
                b=c;
                c=a+b;
            }

            System.out.println();            
        }

        for (int i=0; i<n; i++){

            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print(c+"\t");
                a=b;
                b=c;
                c=a+b;
            }
            
            System.out.println();
        }

        // for (int i=0; i<n-1; i++){

        //     for (int j=n-1; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for (int j=0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i=0; i<n; i++){

        //     for (int j=0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=i; j<n; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }

        /* HOLLOW PYRAMID */

        // for (int i=0; i<n-1; i++){

        //     for (int j=n-1; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for (int j=0; j<=i; j++){
        //         if (j==0 || j==i)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // for (int i=0; i<n; i++){

        //     for (int j=0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=i; j<n; j++){
        //         if (j==i || j == n-1)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
            
        //     System.out.println();
        // }
    }
}
