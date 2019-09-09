
import java.io.*;
import java.util.*;

public class list1{

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // declaring a basic list
        List<Integer> prime = new ArrayList<>();

        prime.add(sc.nextInt());
        prime.add(sc.nextInt());
        prime.add(sc.nextInt());

        // Putting list inside another list
        List<Integer> firstprime = new ArrayList<>(prime);

        // Taking another list
        List<Integer> nextprime = new ArrayList<>();

        nextprime.add(sc.nextInt());
        nextprime.add(sc.nextInt());
        nextprime.add(sc.nextInt());

        // Adding two lists
        firstprime.addAll(nextprime);

        // Print normal
        System.out.println(firstprime);

        // Checking if empty
        System.out.println(firstprime.isEmpty());

        // Fetch from index
        System.out.println(firstprime.get(1));

        // Get the size
        System.out.println(firstprime.size());

        // Modify content
        System.out.println("Enter the index to be modified with the number...");
        int q = sc.nextInt();
        int p = sc.nextInt();

        firstprime.set(q, p);
        System.out.println("Modified:"+firstprime);

        // Remove elements by index
        firstprime.remove(2);
        System.out.println("Truncated by index:"+firstprime);

        // Remove elements by first occurence
        firstprime.remove(Integer.valueOf(11));
        System.out.println("Truncated by first element:"+firstprime);

        // Remove elements by all of em.
        firstprime.removeAll(Arrays.asList(11));
        System.out.println("Truncated all of an element:"+firstprime);

        // Clear entire ArrayList
        firstprime.clear();

        System.out.println("Enter no of elements in list:\t");
        int n = sc.nextInt();
        System.out.println("Enter no of elements");
        for (int i=1; i<=n; i++){
             firstprime.add(sc.nextInt());
        }

        // Print as whole
        System.out.println(firstprime);

        // Print in loop
        for (int i=0; i<n; i++){
            System.out.print(firstprime.get(i)+" ");
       } 
       System.out.println();

       // Insert an element
       System.out.println("Enter location and element");
       int a = sc.nextInt();
       int b = sc.nextInt();
       firstprime.add(a, b);
       System.out.println(firstprime);

       // Sort in ascending order
       Collections.sort(firstprime);
       System.out.println(firstprime);

       // For strings, it sorts lexicographically

       // Sort in descending order
       Collections.reverse(firstprime);
       System.out.println(firstprime);
    }
}