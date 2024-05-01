import java.util.Deque;
import java.util.LinkedList;

public class slidingWindow {
    // now using deque
    public static void printMax(int[] arr, int k){
        Deque<Integer> deq = new LinkedList<Integer>();
        int i;
        for(i = 0 ; i < k ; i++){ // 0 1 2
            while(!deq.isEmpty() && arr[i] >= arr[deq.peekLast()]){ //arr[2] >= arr[1]
                deq.removeLast(); //deq = 
            }
            //add new element at rear of queue
            deq.addLast(i); //deq = 78
        }


        // process rest of the element, i.e. from arr[k] to arr[n-1]
        for(; i < arr.length ; ++i){
            
            System.out.print(arr[deq.peek()]+" ");
            while((!deq.isEmpty()) && deq.peek() <= i-k){
                deq.removeFirst();
            }
            while((!deq.isEmpty()) && arr[i] >= arr[deq.peekLast()]){
                deq.removeLast();
            }
            // add current element at the rear of deq
            deq.addLast(i);
        }
        // print all the max element of last window 
        System.out.print(arr[deq.peek()]);
    }
    public static void main(String[] args) {
        // int arr[] = {2,4,7,10,12,15,25,17};
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        // int maxVal = 0;
        // for(int i = 0 ; i < arr.length ; i++){
        //     for(int j = 1 ; j < arr.length - k + 1 ; j++){
        //         maxVal = arr[i];
        //         if(maxVal < arr[j]){
        //             maxVal = arr[j];
        //         }
        //     }
        // }
        // System.out.print(maxVal);
        printMax(arr, k);
    }
}
