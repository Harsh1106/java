// package Searching;
// TC: O(logN)
// SC: O(1)
import java.util.*;
public class Binary {
    public static int binary(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }     
        }
        return 0;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int size = sc.nextInt();

        System.out.println("Enter the element in array:");
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Ennter the element you want to search: ");
        int element = sc.nextInt();

        int idx = binary(arr, element);
        if(idx == 0){
            System.out.println("Element is not in the array!");
        }else{
            System.out.println("Element is in the array at index "+idx);
        }
    }
}
