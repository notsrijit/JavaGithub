
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
        int n = sc.nextInt();
        int a = sc.nextInt();

        firstprime.set(n, a);
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

    }
}