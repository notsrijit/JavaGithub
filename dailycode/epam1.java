
import java.util.*;

public class epam1 {

	public static int[] nearestSmallerElement(int[] A) {
		//Complete this method
		int B [] = new int [A.length];
		
		for(int i=0; i<A.length; i++){
		    
		    int min = -1;
		    for(int j=0; j<=i; j++){
		        if(A[j] < A[i]){
		            min = A[j];
		        }
		    }
		    B[i] = min;
		}
		
		return B;
	}
	
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] A = new int [n];
        // int B [] = new int [n];
        
        for (int i=0; i<n; i++){
            A [i] = sc.nextInt();
        }
        
        // Main m = new Main();
        int[] B = nearestSmallerElement(A);
                
        System.out.println();
        System.out.print("[");
        for(int i=0; i<n; i++){
            
            if(i == n-1){
                System.out.print(B[i]);
            }
            else{
                System.out.print(B[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

}
	
