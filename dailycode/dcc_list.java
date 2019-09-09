
import java.io.*;
import java.util.*;

public class dcc_list{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int arr [] = new int [n];
        for (int i=0; i<n; i++){
            arr [i] = sc.nextInt();
        }

        int k = sc.nextInt();
        
        int c = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr [i] + arr [j] == k){
                    c++;
                    System.out.println("true");
                    break;
                }
            }
        }

        if (c == 0){
            System.out.println("false");
        }
    }
}