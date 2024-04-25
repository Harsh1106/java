public class slidingWindow {
    public static void main(String[] args) {
        int arr[] = {2,4,7,10,12,15,25,17};
        int k = 3;
        int maxVal = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - k + 1 ; j++){
                maxVal = arr[i];
                if(maxVal < arr[j]){
                    maxVal = arr[j];
                }
            }
            System.out.print(maxVal);
        }
    }
}
