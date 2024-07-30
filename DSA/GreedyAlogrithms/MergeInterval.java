import java.util.Arrays;
import java.util.LinkedList;

public class MergeInterval{
    public static int[][] printMerged(int[][] arr){
            Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
            LinkedList<int[]> list = new LinkedList<>();
            for(int[] a : arr){
                if(list.isEmpty() || list.getLast()[1] < a[0]){
                    list.add(a);
                }
                else{
                    list.getLast()[1] = Math.max(list.getLast()[1], a[1]);
                }
            }
            return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,3},
                    {2,6},
                    {8,10},
                    {15,18}
        };
        int[][] arr2 = printMerged(arr);
        for(int i = 0 ;  i < arr2.length ; i++){
            System.out.print("{");
            for(int j = 0 ; j < arr2[i].length ; j++){
                System.out.print(arr2[i][j]);
                if (j < arr2[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}, ");
        }
    }
}