public class NumberofSubArraysWithOddSum {
    public static int numOfSubarrays(int[] arr) {
        int mod = 1000000007, even = 1, odd = 0, prefix = 0, ans = 0;
        for(int num : arr){
            prefix += num;
            if(prefix % 2 == 0){
                ans += odd;
                even++;
            }
            else{
                ans += even;
                odd++;
            }
            ans = ans % mod;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(numOfSubarrays(arr));
    }
}
