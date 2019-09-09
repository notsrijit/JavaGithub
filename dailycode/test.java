
import java.io.*;
import java.util.*;

public class test{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String num = sc.next();

        // int n1 = (int)num.charAt(0);
        int n1 = Character.getNumericValue(num.charAt(0));
        System.out.println(n1);
    }
}