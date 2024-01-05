import java.util.Scanner;
class ArraySort{
    public void Reverse(int []arr, int key){
        int rev[] = new int[arr.length];
         for(int i = arr.length - 1 ; i >= arr.length - key ; i--){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0 ; i <= (arr.length - 1) - key ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array you want to take: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the times you want to rotate it: ");
        int key = sc.nextInt();
        ArraySort arr = new ArraySort();
        arr.Reverse(array,key);
    }
}