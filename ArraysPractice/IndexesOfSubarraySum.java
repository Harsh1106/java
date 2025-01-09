import java.util.ArrayList;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        int s = 0, e = 0, curr = 0;
        for(int i = 0 ; i < arr.length ; i++){
            curr += arr[i];
            if(curr >= target) e = i;
            while(curr > target && s < e){
                curr -= arr[s];
                ++s;
            }
            if(curr == target){
                al.add(s + 1);
                al.add(e + 1);
                return al;
            }
        }
        al.add(-1);
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target));
    }
}
