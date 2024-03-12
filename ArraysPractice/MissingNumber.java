public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,6,5};
        int n = arr.length;
        int sum = n*(n + 1)/2;
        int sum1 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum1 += arr[i];
        }
        int val;
        if(sum < sum1){
            val = sum - sum1;
            System.out.println(val);
        }
    }
}
