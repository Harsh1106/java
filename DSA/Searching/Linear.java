// package Searching;
// TC: O(n)
// SC: O(1)
import java.util.*;
public class Linear {
    
    public static int linear(int[] arr, int key){
        int index = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                index = i;
                // return index;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the searching element: ");
        int element = sc.nextInt();
        int found = linear(arr, element);
        if(found >= 0){
            System.out.println("Element is at index: "+found);
        }else{
            System.out.println("Element is not in the array!");
        }
    }
}
