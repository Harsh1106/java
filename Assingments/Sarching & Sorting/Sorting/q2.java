// using selection sort
public class q2 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        for(int i = 0 ; i < arr.length ; i++){
            int maxIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
