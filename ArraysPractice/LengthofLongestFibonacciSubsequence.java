import java.util.HashSet;

public class LengthofLongestFibonacciSubsequence {
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, prev1, prev2, len, maxLen = 0;
        HashSet<Integer> s = new HashSet<>();
        if(n < 3)
            return 3;
        for(int num : arr)
            s.add(num);
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                prev1 = arr[j];
                prev2 = arr[i];
                len = 2;
                int sum = prev1 + prev2;
                while(s.contains(sum)){
                    len++;
                    maxLen = Math.max(maxLen, len);
                    prev2 = prev1;
                    prev1 = sum;
                    sum = prev1 + prev2;
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(lenLongestFibSubseq(arr));
    }
}
