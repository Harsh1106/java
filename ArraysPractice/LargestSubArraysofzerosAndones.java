import java.util.HashMap;

public class LargestSubArraysofzerosAndones {
    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int sum = 0, maxLen = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = (arr[i] == 0) ? (sum - 1) : (sum + 1);
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(len, maxLen);
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
        System.out.println(maxLen(arr));
    }
}
