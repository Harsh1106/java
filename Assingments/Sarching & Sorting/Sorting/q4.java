// using bubble sort
public class q4 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        boolean swap;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            swap = false;
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            count++;
            if(!swap){
                break;
            }
        }
        System.out.println(count);
    }
}
