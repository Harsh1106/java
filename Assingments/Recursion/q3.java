public class q3 {
    public static int findMax(int[] arr, int len){
        if(len == 0){
            return arr[len];
        }
        int max = findMax(arr, len - 1);
        
        return Math.max(arr[len - 1], max);
    }
    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int len = arr.length;
        int max = findMax(arr, len);
        System.out.println(max);
    }
}
