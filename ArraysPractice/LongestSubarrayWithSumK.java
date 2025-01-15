import java.util.HashMap;
public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int cSum =  0, max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            cSum += arr[i];
            if(map.containsKey(cSum - k))   
                max = Math.max(max, i - map.get(cSum - k));
            map.putIfAbsent(cSum, i);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
