
import java.io.*;
import java.util.*;

public class between_two_sets{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr [] = new int [a];
        int brr [] = new int [b];

        for (int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<b; i++){
            brr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = arr[0]; i<=brr[b-1]; i++){

            int c = 0;
            for (int j=0; j<a; j++){
                if( i % arr[j] == 0 ){
                    c++;
                }
            }
            int x = 0;                
            if( c == a ){
                for (int k=0; k<b; k++){
                    if( brr[k] % i == 0 ){
                        x++;
                    }
                }
            }

            if ( x == b ){
                count ++;
            }

        }

        System.out.println(count);
    }
}