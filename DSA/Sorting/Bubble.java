// TC: O(n^2)
// 
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 12, 45};
        boolean swap = false;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){ //for every iteration we get the biggest element in an array in the end.
                if(arr[j] > arr[j+1]){
                    // swap between arr[j] & arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
