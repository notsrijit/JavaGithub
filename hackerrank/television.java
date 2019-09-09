
import java.io.*;
import java.util.*;

public class television{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        long target = sc.nextLong();

        
        long totalprice = 0;
        int flag = 0;
        int tvrooms = 0;

        // Calculating and adding the yearly income of every TV room
        for (int k=1; k<=n; k++){
            
            // Per TV room's entire year income being calculated
            long roomprice = 0;

            for (int i=1; i<=12; i++){
                // Calculating yearly per room income by adding TV room's price per month

                if (i == 1 || i==3 || i==5 || i==7 || i==8 || i == 10 || i == 12){
                    roomprice = roomprice + (r1 * 31);                    
                }
                else if (i == 4 || i==6 || i==9 || i==11){
                    roomprice = roomprice + (r1 * 30);
                }
                else{
                    roomprice = roomprice + (r1 * 28);                    
                }
    
            }

            // Calculating total income of all the rooms
            totalprice = totalprice + roomprice;

            tvrooms++;
            if( totalprice >= target ){
                flag++;
                break;
            }

        }

        if (flag == 1){
            System.out.println(tvrooms+1);
        }
        else{
            System.out.println(n);
        }
        
    }
}