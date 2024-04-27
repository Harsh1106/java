/*
 Give an array nums of size n, return the largest element.
 I/P: 4,2,7,1,9
 O/P: 9

 I/P: 3,1,2,8,6
 O/P: 8
 */

//  TC of insertion in TreeMap: O(logn)
// TC: O(nlogn)
// SC: O(n)
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            tree.put(arr[i], 1);
        }
        System.out.println("The largest element from the array: " +tree.lastEntry().getKey());
    }
}
