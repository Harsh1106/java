// TC: O(n)
// SC: O(1)
public class missingArray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,7,6,5};
        int arr[] = {3,0,1};
        int m = arr.length;
        int n = m + 1;  
        int sum_natural_num = n*(n+1)/2;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        int missing_num = sum_natural_num - sum;
        System.out.println(missing_num);
    }
}
