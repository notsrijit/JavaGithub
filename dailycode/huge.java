
import java.io.*;
import java.util.*;

public class huge{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String num = sc.next();
        long odd=0, even=0, diff=0;

        for(int i=0; i<num.length(); i++){

            if(i%2==0){
                even = even + Character.getNumericValue(num.charAt(i));
            }
            else{
                odd = odd + Character.getNumericValue(num.charAt(i));
            }

        }

        diff = Math.abs(even-odd);
        System.out.println(diff);
    }
}