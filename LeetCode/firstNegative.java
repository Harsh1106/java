import java.util.*;
public class firstNegative{
    public static void findfirstNeg(int[] arr, int k){
        int n = arr.length;
        
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer> pq = new LinkedList<>();
        int i = 0;
        int j = 0;
        int zero = 0;
        while(j < n){
            if(arr[j] < 0){
                pq.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if((j - i + 1) == k){
                if(pq.isEmpty())
                    al.add(0);
                else{
                    al.add(pq.peek());
                    if(arr[i] == pq.peek()){
                        pq.poll();
                    }
                    i++;
                    j++;
                }
            }
        }
        for(int m = 0 ; m < al.size() ; m++){
            System.out.println(al.get(m)+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        findfirstNeg(arr, k);

    }
}