import java.io.*;
import java.util.*;

public class Test1{

    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);

        int money = sc.nextInt();
        int kb = sc.nextInt();
        int ub = sc.nextInt();
        int max = Integer.MIN_VALUE, flag = 0;

        int keyb [] = new int [kb];
        int usb [] = new int [ub];

        for (int i=0; i<kb; i++){
            keyb[i] = sc.nextInt();
        }
        for (int i=0; i<ub; i++){
            usb[i] = sc.nextInt();
        }

        for (int i=0; i<kb; i++){
            if (keyb[i] < money){
                for (int j=0; j<ub; j++){
                    int cost = keyb[i] + usb[j];
                    if ( cost <= money && cost > max ){
                        max = cost;
                        flag = 1;
                    }
                    else{
                    }
                }
            }
            else{
            }
        }
        if (flag == 1){
            System.out.println (max);
        }
        else{
            System.out.println (-1);
        }

    }
}