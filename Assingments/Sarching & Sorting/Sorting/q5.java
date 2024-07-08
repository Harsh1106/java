public class q5 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        int count = 0;
        for(int i = 0 ; i < arr.length - 1; i++){
            int maxIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
            count++;
        }
        System.out.println(count);
    }
}
