import java.util.Scanner;

public class LargestArray {
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int lar = findLargest(arr);
        System.out.println("Largest element in the array is: "+lar);
    }
}
