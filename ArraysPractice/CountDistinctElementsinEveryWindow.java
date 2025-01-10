import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElementsinEveryWindow {
    static ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i <= arr.length - k ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i ; j < i + k ; j++) set.add(arr[j]);
            al.add(set.size());
        }
        return al;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct(arr, k));
    }
}
