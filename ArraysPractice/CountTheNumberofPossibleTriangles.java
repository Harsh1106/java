import java.util.Arrays;

public class CountTheNumberofPossibleTriangles {
    static int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            int st = 0, end = i - 1;
            while(st < end){
                if(arr[st] + arr[end] > arr[i]){
                    count += (end - st);
                    end--;
                }
                else{
                    st++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println(countTriangles(arr));
    }
}
