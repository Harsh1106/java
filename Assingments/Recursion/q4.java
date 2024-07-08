public class q4 {
    public static int findSum(int[] arr, int index){
        if(arr.length == index){
            return 0;
        }
        int sum = findSum(arr, index + 1);

        return arr[index] + sum;
    }
    public static void main(String[] args) {
       int[] arr = {92, 23, 15, -20, 10};
       int sum = findSum(arr, 0);
       System.out.println(sum);
    }
}
