import java.util.List;
import java.util.ArrayList;
public class Subsets {
    public static void solve(int[] nums, int idx, List<Integer> al, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[idx]);
        solve(nums, idx + 1, al, ans);
        al.remove(al.size() - 1);
        solve(nums, idx + 1, al, ans);
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        solve(nums, 0, al, ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
